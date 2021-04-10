
package dev.salesforcecraft.sfallure.models.testrun;

import lombok.Data;

import java.util.Map;

@Data
public class ClassCoverageDetails {
    private String id;
    private String name;
    private Integer totalLines;
    private Map<String, Integer> lines;
    private Integer totalCovered;
    private Integer coveredPercent;
}
