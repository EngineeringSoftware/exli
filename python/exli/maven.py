import dataclasses
import functools
from pathlib import Path
from typing import List, Set

import seutil as su
import xmltodict
import os

logger = su.log.get_logger(__name__, su.log.INFO)
SKIPS_NO_JACOCO = "-Dcheckstyle.skip -Drat.skip -Denforcer.skip -Danimal.sniffer.skip -Dmaven.javadoc.skip -Dfindbugs.skip -Dwarbucks.skip -Dmodernizer.skip -Dimpsort.skip -Dpmd.skip -Dxjc.skip -Dair.check.skip-all"
SKIPS = "-Djacoco.skip " + SKIPS_NO_JACOCO


@dataclasses.dataclass
class MavenModule:
    group_id: str
    artifact_id: str
    version: str
    packaging: str
    rel_path: str = "."
    project: "MavenProject" = None
    pom_modified: Set[str] = dataclasses.field(default_factory=set)

    def serialize(self):
        return {
            "group_id": self.group_id,
            "artifact_id": self.artifact_id,
            "version": self.version,
            "packaging": self.packaging,
            "rel_path": self.rel_path,
        }

    @functools.cached_property
    def main_srcpath(self) -> str:
        return str(self.project.dir / self.rel_path / "src" / "main" / "java")

    @functools.cached_property
    def test_srcpath(self) -> str:
        return str(self.project.dir / self.rel_path / "src" / "test" / "java")

    @functools.cached_property
    def main_classpath(self) -> str:
        return str(self.project.dir / self.rel_path / "target" / "classes")

    @functools.cached_property
    def test_classpath(self) -> str:
        return str(self.project.dir / self.rel_path / "target" / "test-classes")

    @functools.cached_property
    def dependency_classpath(self) -> str:
        with su.io.cd(self.project.dir / self.rel_path):
            tmp_file = su.io.mktmp(prefix="cp")
            su.bash.run(
                f"mvn dependency:build-classpath -Dmdep.outputFile={tmp_file}", 0
            )
            classpath = su.io.load(tmp_file, fmt=su.io.Fmt.txt).strip()
            su.io.rm(tmp_file)
            return classpath

    @functools.cached_property
    def exec_classpath(self) -> str:
        with su.io.cd(self.project.dir / self.rel_path):
            tmp_file = su.io.mktmp(prefix="ecp")
            su.bash.run(
                f"mvn -q exec:exec -Dexec.executable=echo -Dexec.args='%classpath' > {tmp_file}",
                0,
            )
            classpath = su.io.load(tmp_file, fmt=su.io.Fmt.txt).strip()
            su.io.rm(tmp_file)
            return classpath

    @functools.cached_property
    def coordinate(self) -> str:
        return f"{self.group_id}:{self.artifact_id}:{self.version}"

    def backup_pom(self):
        if len(self.pom_modified) > 0:
            raise RuntimeError(
                f"Cannot backup pom.xml for {self.coordinate} because it has been modified"
            )
        with su.io.cd(self.project.dir / self.rel_path):
            su.bash.run("cp pom.xml pom.xml.backup", 0)

    def restore_pom(self):
        with su.io.cd(self.project.dir / self.rel_path):
            su.bash.run("cp pom.xml.backup pom.xml", 0)
        self.pom_modified.clear()

    def hack_pom_delete_plugin(self, artifact_id: str, is_plugin: bool = True):
        """Hack the pom.xml to delete plugin with the given artifact_id"""
        modification = f"delete_plugin:{artifact_id}"
        if modification in self.pom_modified:
            logger.debug(f"pom.xml for {self.coordinate} already did {modification}")
            return

        pom = xmltodict.parse(
            su.io.load(self.project.dir / self.rel_path / "pom.xml", fmt=su.io.Fmt.txt)
        )

        if is_plugin:
            plugins = (
                pom.get("project", {})
                .get("build", {})
                .get("plugins", {})
                .get("plugin", [])
            )
            if not isinstance(plugins, list):
                plugins = [plugins]
                pom.get("build", {}).get("plugins", {})["plugin"] = plugins
        else:
            plugins = (
                pom.get("project", {}).get("dependencies", {}).get("dependency", [])
            )
            if not isinstance(plugins, list):
                plugins = [plugins]
                pom.get("project", {}).get("dependencies", {})["dependency"] = plugins
        to_remove = None

        for i, plugin in enumerate(plugins):
            if plugin.get("artifactId") == artifact_id:
                to_remove = i
                break
        if to_remove is not None:
            del plugins[to_remove]

        su.io.dump(
            self.project.dir / self.rel_path / "pom.xml",
            xmltodict.unparse(pom),
            fmt=su.io.Fmt.txt,
        )

        self.pom_modified.add(modification)

    def hack_pom_add_dependency(self, group_id: str, artifact_id: str, version: str):
        """Hack the pom.xml to add dependency with the given artifact_id"""
        modification = f"add_dependency:{artifact_id}"

        pom = xmltodict.parse(
            su.io.load(self.project.dir / self.rel_path / "pom.xml", fmt=su.io.Fmt.txt)
        )

        dependencies = (
            pom.get("project", {}).get("dependencies", {}).get("dependency", [])
        )
        if not isinstance(dependencies, list):
            dependencies = [dependencies]
            pom.get("project", {}).get("dependencies", {})["dependency"] = dependencies
        dependencies.append(
            {"groupId": group_id, "artifactId": artifact_id, "version": version}
        )

        su.io.dump(
            self.project.dir / self.rel_path / "pom.xml",
            xmltodict.unparse(pom),
            fmt=su.io.Fmt.txt,
        )

        self.pom_modified.add(modification)

    def compile(self, timeout=600, retry_with_package=True, clean=False):
        with su.io.cd(self.dir / self.rel_path):
            if clean:
                su.bash.run("mvn clean", 0)
            rr = su.bash.run(f"mvn test-compile {SKIPS}", timeout=timeout)
            if rr.returncode != 0:
                if retry_with_package:
                    su.bash.run(f"mvn package -DskipTests {SKIPS}", 0, timeout=timeout)
                else:
                    raise RuntimeError(f"Failed to compile")


@dataclasses.dataclass
class MavenProject:
    multi_module: bool = False
    modules: List[MavenModule] = dataclasses.field(default_factory=list)
    dir: Path = None

    def serialize(self):
        return {
            "multi_module": self.multi_module,
            "modules": su.io.serialize(self.modules),
        }

    @classmethod
    def from_project(cls, project: su.project.Project) -> "MavenProject":
        if not (project.dir / "pom.xml").exists():
            return None
        project.require_cloned()
        maven_proj = cls(dir=project.dir)
        # detect modules from the project
        with su.io.cd(maven_proj.dir):
            rr = su.bash.run(
                """mvn -Dexec.executable='bash' -Dexec.args='-c '"'"'echo ${project.groupId}:${project.artifactId}:${project.version} ${project.packaging} ${PWD}'"'"'' exec:exec -q""",
                0,
            )
        for line in rr.stdout.splitlines():
            coord, packaging, abs_path = line.split(" ", 2)
            group_id, artifact_id, version = coord.split(":")
            rel_path = str(Path(abs_path).relative_to(maven_proj.dir))
            maven_proj.modules.append(
                MavenModule(
                    group_id=group_id,
                    artifact_id=artifact_id,
                    version=version,
                    packaging=packaging,
                    rel_path=rel_path,
                    project=maven_proj,
                )
            )
            maven_proj.modules.sort(key=lambda m: m.coordinate)
        maven_proj.multi_module = len(maven_proj.modules) > 1
        return maven_proj

    def backup_pom(self):
        for module in self.modules:
            module.backup_pom()

    def restore_pom(self):
        for module in self.modules:
            module.restore_pom()

    def hack_pom_delete_plugin(self, artifact_id: str, is_plugin: bool = True):
        # is_plugin = False means that it tries to delete the dependency
        for module in self.modules:
            module.hack_pom_delete_plugin(artifact_id, is_plugin)

    def hack_pom_add_dependency(self, group_id: str, artifact_id: str, version: str):
        for module in self.modules:
            module.hack_pom_add_dependency(group_id, artifact_id, version)

    def compile(self, timeout=600, retry_with_package=True, clean=False):
        with su.io.cd(self.dir):
            if clean:
                su.bash.run("mvn clean", 0)
            rr = su.bash.run(f"mvn test-compile {SKIPS}", timeout=timeout)
            if rr.returncode != 0:
                if retry_with_package:
                    su.bash.run(f"mvn package -DskipTests {SKIPS}", 0, timeout=timeout)
                else:
                    raise RuntimeError(f"Failed to compile")

    def install(self, timeout=600, clean=False):
        with su.io.cd(self.dir):
            if clean:
                su.bash.run("mvn clean", 0)
            rr = su.bash.run(f"mvn install -DskipTests {SKIPS}", 0, timeout=timeout)
            if rr.returncode != 0:
                raise RuntimeError(f"Failed to install")

    def get_module_by_path(self, file_path: Path) -> MavenModule:
        module_path = file_path.parent
        while module_path != Path("."):
            if (module_path / "src/main/java").exists() or (
                module_path / "src/test/java"
            ).exists():
                break
            module_path = module_path.parent
        for module in self.modules:
            if os.path.realpath(module.rel_path) == os.path.realpath(module_path):
                return module
        raise RuntimeError(f"Failed to find module for {file_path}, {module_path}")

    @classmethod
    def java_file_to_java_class(cls, java_file: str) -> str:
        # parse java file path to java class path
        test_class_path = java_file.replace(".java", ".class")
        if "src/main/java" in test_class_path:
            test_class_path = test_class_path.replace("src/main/java", "target/classes")
        elif "src/test/java" in test_class_path:
            test_class_path = test_class_path.replace(
                "src/test/java", "target/test-classes"
            )
        return test_class_path

    def exec_classpathes(self, project_path: Path, log_path: Path) -> str:
        # need to invoke mvn install before invoking this method
        dependency_list = []
        # get dependencies from each module
        for module in self.modules:
            maven_module_path = f"{project_path}/{module.rel_path}"
            dependencies = module.dependency_classpath
            dependencies = (
                os.path.abspath(f"{maven_module_path}/target/classes")
                + ":"
                + os.path.abspath(f"{maven_module_path}/target/test-classes")
                + ":"
                + dependencies
            )
            if dependencies:
                dependency_list.append(dependencies)
            else:
                su.bash.run(
                    f'echo "{project_path} {module.rel_path} no dependencies" >> {log_path}',
                    0,
                )

        if not dependency_list:
            su.bash.run(
                f'echo "{project_path} no dependencies" >> {log_path}',
                0,
            )
            return
        dependencies = ":".join(dependency_list)
        dependencies_set = set(dependencies.split(":"))
        if "" in dependencies_set:
            dependencies_set.remove("")
        dependencies = ":".join(dependencies_set)
        return dependencies
