
package dev.salesforcecraft.sfallure.models.testrun;

import dev.salesforcecraft.sfallure.models.testrun.ApexClass;
import dev.salesforcecraft.sfallure.models.testrun.Attributes;
import lombok.Data;

@Data
public class TestResult {
    private Attributes attributes;
    private String id;
    private String queueItemId;
    private String stackTrace;
    private String message;
    private String asyncApexJobId;
    private String methodName;
    private String outcome;
    private ApexClass apexClass;
    private Integer runTime;
    private String fullName;
}
