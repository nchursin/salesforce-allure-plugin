
package dev.salesforcecraft.sfallure.models.testrun;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CoverageData {
    private List<ClassCoverageDetails> coverage = new ArrayList<ClassCoverageDetails>();
    private List<CoverageSfRecord> records = new ArrayList<CoverageSfRecord>();
    private CoverageSummary summary;
}
