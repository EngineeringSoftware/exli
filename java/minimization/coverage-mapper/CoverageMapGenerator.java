package edu.cornell.minimizer;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.IMethodCoverage;
import org.jacoco.core.tools.ExecFileLoader;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 * This class takes a set of jacoco.exec files obtained from running
 * some "tests" and produces the map of coverage for each line in all
 * classes that are covered per test. The name of each jacoco.exec is
 * used as the test name. Tests can be at any granularity level.
 */

public class CoverageMapGenerator {

    private final File execFileDir;
    private final File classesDirectory;

    private ExecFileLoader execFileLoader;

    /**
     * Create a new generator based for the given project.
     */
    public CoverageMapGenerator(final File execDir, final File compileDir) {
        this.execFileDir = execDir;
        this.classesDirectory = compileDir;
    }

    /**
     * Create the reports.
     *
     * @throws IOException
     */
    public void create(File[] execFiles) throws IOException {
        Map<String, Map<String, Map<Integer, List<Integer>>>> covMap
                = new HashMap<String, Map<String, Map<Integer, List<Integer>>>>();

        for (File execFile : execFiles) {

            // Read a jacoco.exec file.
            loadExecutionData(execFile);

            // Run the structure analyzer on a single class folder to build up
            // the coverage model. The process would be similar if your classes
            // were in a jar file. Typically you would create a bundle for each
            // class folder and each jar you want in your report. If you have
            // more than one bundle you will need to add a grouping node to your
            // report
            String testName = execFile.getName().substring(0, execFile.getName().lastIndexOf("."));

            covMap.put(testName, new HashMap<String, Map<Integer, List<Integer>>>());

            analyzeStructure(testName, covMap);
        }
        System.out.println("CovMap: " + covMap);
        JSONObject json = new JSONObject(covMap);
        Path path = Paths.get("covMap.json");
        Files.write(path, json.toString().getBytes());
    }

    private void loadExecutionData(File execFile) throws IOException {
        execFileLoader = new ExecFileLoader();
        execFileLoader.load(execFile);
    }

    private void analyzeStructure(String testName, Map<String, Map<String, Map<Integer, List<Integer>>>> covMap) throws IOException {
        final CoverageBuilder coverageBuilder = new CoverageBuilder();
        final Analyzer analyzer
            = new Analyzer(execFileLoader.getExecutionDataStore(), coverageBuilder);

        analyzer.analyzeAll(classesDirectory);

        for (IClassCoverage icc : coverageBuilder.getClasses()) {

            String name = icc.getName().replace('/', '.');
            Map<Integer, List<Integer>> covLinesMap = new HashMap<Integer, List<Integer>>();

            for (int i = icc.getFirstLine(); i <= icc.getLastLine(); i++) {
                List<Integer> statusList = new ArrayList<Integer>();
                int status = icc.getLine(i).getStatus();
                statusList.add(status);
                statusList.add(icc.getLine(i).getInstructionCounter().getCoveredCount());
                if (status == 0){
                    // 0 means that the line is empty
                    statusList.add(0);
                }else{
                    for (IMethodCoverage iMethodCoverage : icc.getMethods()){
                        if (iMethodCoverage.getFirstLine() <= i && i <= iMethodCoverage.getLastLine()){
                            statusList.add(iMethodCoverage.getMethodCounter().getCoveredCount());
                            break;
                        }
                    }
                }
                covLinesMap.put(i, statusList);
            }

            covMap.get(testName).put(name, covLinesMap);
        }
    }

    public static void main(final String[] args) throws IOException {
        // The first argument is the directory with the jacoco.exec
        // files

        // The second argument is the directory with the compiled
        // sources that we care about
        CoverageMapGenerator generator = new CoverageMapGenerator(new File(args[0]), new File(args[1]));
        File [] execFiles = generator.execFileDir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".exec");
                }
            });

        generator.create(execFiles);
    }
}