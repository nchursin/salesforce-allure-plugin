
package dev.salesforcecraft.sfallure.models;

import dev.salesforcecraft.sfallure.models.testrun.CoverageData;
import dev.salesforcecraft.sfallure.models.testrun.SfApexTestResult;
import dev.salesforcecraft.sfallure.models.testrun.TestRunSummary;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class SfApexTestRunResult {

    private TestRunSummary summary;
    private List<SfApexTestResult> tests = new ArrayList<SfApexTestResult>();
    private CoverageData coverage;

}
