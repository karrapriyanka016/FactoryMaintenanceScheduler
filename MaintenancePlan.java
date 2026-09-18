package model;

public record MaintenancePlan(String machineId, int intervalHours, int warningHours) {
    public MaintenancePlan {
        if (intervalHours <= 0) throw new IllegalArgumentException("Interval must be positive.");
        if (warningHours < 0 || warningHours >= intervalHours)
            throw new IllegalArgumentException("Warning hours must be smaller than interval.");
    }
}
