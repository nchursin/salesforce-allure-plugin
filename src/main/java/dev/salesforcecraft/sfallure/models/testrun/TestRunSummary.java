
package dev.salesforcecraft.sfallure.models.testrun;

import lombok.Data;

@Data
public class TestRunSummary {
    private String outcome;
    private Integer testsRan;
    private Integer passing;
    private Integer failing;
    private Integer skipped;
    private String passRate;
    private String failRate;
    private String testStartTime;
    private String testExecutionTime;
    private String testTotalTime;
    private String commandTime;
    private String hostname;
    private String orgId;
    private String username;
    private String testRunId;
    private String userId;
    private String testRunCoverage;
    private String orgWideCoverage;
}
