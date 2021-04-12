
package dev.salesforcecraft.sfallure.models.testrun;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.qameta.allure.entity.Status;
import io.qameta.allure.entity.TestResult;
import io.qameta.allure.entity.Time;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonPOJOBuilder(withPrefix = "")
public class SfApexTestResult {
    private Attributes attributes;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("QueueItemId")
    private String queueItemId;
    @JsonProperty("StackTrace")
    private String stackTrace;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("AsyncApexJobId")
    private String asyncApexJobId;
    @JsonProperty("MethodName")
    private String methodName;
    @JsonProperty("Outcome")
    private String outcome;
    @JsonProperty("ApexClass")
    private ApexClass apexClass;
    @JsonProperty("RunTime")
    private Integer runTime;
    @JsonProperty("FullName")
    private String fullName;

    public TestResult getAllureTestResult() {
        final TestResult result = new TestResult();
        result.setUid(this.id);
        result.setName(this.fullName);
        result.setStatus(this.getAllureStatus());
        result.setStatusMessage(this.message);
        result.setStatusTrace(this.stackTrace);
        if (null != this.runTime) {
            result.setTime(new Time());
            result.getTime().setDuration(Long.valueOf(this.runTime));
        }
        return result;
    }

    private Status getAllureStatus() {
        if(null == this.outcome) {
            return Status.UNKNOWN;
        }
        switch (this.outcome) {
            case "Pass":
                return Status.PASSED;
            case "Fail":
                return Status.FAILED;
            default:
                return Status.UNKNOWN;
        }
    }
}
