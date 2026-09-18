package model;

import java.time.LocalDate;

public record MaintenanceRecord(
        String machineId,
        LocalDate date,
        String technician,
        String workPerformed) {}
