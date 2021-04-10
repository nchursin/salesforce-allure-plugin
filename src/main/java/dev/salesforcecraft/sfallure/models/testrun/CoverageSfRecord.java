
package dev.salesforcecraft.sfallure.models.testrun;

import lombok.Data;

@Data
public class CoverageSfRecord {

    private Attributes attributes;
    private ApexTestClass apexTestClass;
    private CoverageLinesInfo coverage;
    private String testMethodName;
    private Integer numLinesCovered;
    private ApexClassOrTrigger apexClassOrTrigger;
    private Integer numLinesUncovered;

}
