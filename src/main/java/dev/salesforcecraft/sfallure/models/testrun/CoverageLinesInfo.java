
package dev.salesforcecraft.sfallure.models.testrun;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CoverageLinesInfo {
    private List<Integer> coveredLines = new ArrayList<Integer>();
    private List<Integer> uncoveredLines = new ArrayList<Integer>();
}
