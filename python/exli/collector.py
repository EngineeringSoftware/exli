from jsonargparse import CLI
import seutil as se
from exli.macros import Macros
import re


class Collector:
    def __init__(self):
        pass

    def bash_str_parse_helper(self, bash_str: str):
        bash_str = bash_str.replace(".", r"\.")
        bash_str = bash_str.replace("(", r"\(")
        return bash_str

    # python -m collector collect_examples_with_keywords --keyword "re.match"
    def collect_examples_with_keywords(
        self,
        keyword: str,
        exp_type: str = "",
        exclude_keyword: str = "",
        project_name: str = "",
    ):
        projects_dir = f"{Macros.downloads_dir}/{project_name}"
        if not (Macros.results_dir / "grep").exists():
            (Macros.results_dir / "grep").mkdir()
        search_keyword = self.bash_str_parse_helper(keyword)
        print(f"Filter examples with keyword '{search_keyword}'")
        count = 0
        json_res = []
        with se.io.cd(projects_dir):
            se.bash.run(f"git clean -xfd")
            se.bash.run(f"git reset --hard")
            file_suffix = "java"
            if exclude_keyword:
                search_exclude_keyword = self.bash_str_parse_helper(exclude_keyword)
                command = f"grep -rn -E '{search_keyword}' --include='*.{file_suffix}' | grep -v '{search_exclude_keyword}'"
                print(command)
                # TODO: use "-C 5" to show context
                res = se.bash.run(command).stdout
            else:
                command = f"grep -rn -E '{search_keyword}' --include='*.{file_suffix}'"
                print(command)
                res = se.bash.run(command).stdout
            for line in res.splitlines():
                if "src/test/java" in line or "randoop-tests" in line:
                    continue
                filename = ""
                line_number_list = []
                line_list = []
                if line == "":
                    continue
                re_line = re.match(r"^(.*)[:](\d+)[:](.*)$", line)
                if not re_line:
                    print("cannot match regex:", line)
                    continue
                split_lines = re_line.groups()
                if len(split_lines) < 3:
                    print("length smaller than 3:", line)
                    continue
                filename = split_lines[0]
                line_number = split_lines[1]
                line_content = split_lines[2]
                if (
                    line_content.strip().startswith(r"//")
                    or line_content.strip().startswith(r"/*")
                    or line_content.strip().startswith(r"*")
                ):
                    continue
                line_number_list.append(line_number)
                line_list.append(line_content)
                if filename == "" or len(line_number_list) == 0 or len(line_list) == 0:
                    print("filename or line_number_list or line_list is empty:", line)
                    continue
                json_res.append(
                    {
                        "filename": filename,
                        "line_number": ",".join(line_number_list),
                        "line_content": line_list,
                        "inline": "",
                    }
                )
                count += 1

        print(f"{count} examples found")
        se.io.dump(
            f"{Macros.results_dir}/grep/examples_{project_name}_{exp_type}.json",
            json_res,
            se.io.Fmt.jsonPretty,
        )

    # python -m collector filter_projects
    def filter_projects(self):
        type_to_keyword = {
            "regex": ".matches(|.matcher(",
            "string": ".split(|.subString(|.indexOf(|.format(|.replace(|.group(",
            "bit": " >> | << | & | \| | ^ | ~ | &= | \|= | ^= | >>= | <<= ",
            "stream": "Stream.of(|.stream(",
        }
        project_names = se.io.load(f"{Macros.results_dir}/randoop.txt").splitlines()
        for project_name in project_names:
            for exp_type in ["regex", "string", "bit", "stream"]:
                self.filter_examples_with_keywords(
                    type_to_keyword[exp_type], exp_type, "", project_name
                )

    # python -m collector group_json_to_yaml
    def group_json_to_yaml(self):
        teco_projects = se.io.load(f"{Macros.results_dir}/teco-projects.json")
        project_name_to_sha = {}
        for teco_project in teco_projects:
            project_name_to_sha[teco_project["full_name"]] = teco_project["sha"]

        project_names = se.io.load(f"{Macros.results_dir}/randoop.txt").splitlines()
        for project_name in project_names:
            se.io.mkdir(Macros.data_dir / project_name)
            res = []
            for exp_type in ["regex", "string", "bit", "stream"]:
                json_res = se.io.load(
                    f"{Macros.results_dir}/grep/examples_{project_name}_{exp_type}.json",
                    se.io.Fmt.json,
                )
                for json_item in json_res:
                    res_item = {}
                    res_item["line"] = int(json_item["line_number"])
                    res_item["commit"] = project_name_to_sha[project_name]
                    res_item["type"] = exp_type
                    res_item["path"] = json_item["filename"]
                    res_item["project"] = project_name
                    res_item["target"] = json_item["line_content"][0]
                    res_item["inline test"] = ""
                    res.append(res_item)
            se.io.dump(
                Macros.data_dir / project_name / f"{project_name}.yaml",
                res,
                se.io.Fmt.yaml,
            )


if __name__ == "__main__":
    CLI(Collector, as_positional=False)
