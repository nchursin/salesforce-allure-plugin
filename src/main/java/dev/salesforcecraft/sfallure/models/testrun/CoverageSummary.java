
package dev.salesforcecraft.sfallure.models.testrun;

import lombok.Data;

@Data
public class CoverageSummary {
    private Integer totalLines;
    private Integer coveredLines;
    private String testRunCoverage;
    private String orgWideCoverage;
}
