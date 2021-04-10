
package dev.salesforcecraft.sfallure.models.testrun;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Result {

    private TestRunSummary summary;
    private List<TestResult> tests = new ArrayList<TestResult>();
    private CoverageData coverage;

}
