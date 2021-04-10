
package dev.salesforcecraft.sfallure.models;

import dev.salesforcecraft.sfallure.models.testrun.Result;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SfApexTestRunInfo {
    private Integer status;
    private Result result;
    private List<String> warnings = new ArrayList<String>();
}
