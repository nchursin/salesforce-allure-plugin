package dev.salesforcecraft.sfallure.allure.impl;

import dev.salesforcecraft.sfallure.models.SfApexTestRunResult;
import dev.salesforcecraft.sfallure.models.testrun.SfApexTestResult;
import io.qameta.allure.Reader;
import io.qameta.allure.context.JacksonContext;
import io.qameta.allure.core.Configuration;
import io.qameta.allure.core.ResultsVisitor;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class SfTestResultReader implements Reader {
    private String fileName = "sf-test-results.json";


    @Override
    public void readResults(Configuration configuration, ResultsVisitor visitor, Path directory) {
        final JacksonContext context = configuration.requireContext(JacksonContext.class);
        final Path testResultFile = directory.resolve(this.fileName);
        if (Files.exists(testResultFile)) {
            try (InputStream resultContentStream = Files.newInputStream(testResultFile)) {
                final SfApexTestRunResult info = context.getValue().readValue(resultContentStream, SfApexTestRunResult.class);

                for(SfApexTestResult testResult : info.getTests()) {
                    visitor.visitTestResult(testResult.getAllureTestResult());
                }
            } catch (IOException e) {
                visitor.error("Could not read test result file " + testResultFile, e);
            }
        }
    }
}
