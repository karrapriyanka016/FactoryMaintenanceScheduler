package model;

import java.time.LocalDate;

public record IssueReport(
        String machineId,
        String description,
        int severity,
        LocalDate reportedDate,
        boolean resolved) {

    public IssueReport {
        if (severity < 1 || severity > 5) {
            throw new IllegalArgumentException("Severity must be between 1 and 5.");
        }
    }
}
