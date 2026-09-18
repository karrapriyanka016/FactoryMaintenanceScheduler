package model;

import java.time.LocalDate;

public class Machine {
    private final String id;
    private String name;
    private String department;
    private int usageHours;
    private LocalDate installationDate;
    private MachineStatus status;

    public Machine(String id, String name, String department, int usageHours, LocalDate installationDate) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("Machine ID is required.");
        if (usageHours < 0) throw new IllegalArgumentException("Usage hours cannot be negative.");
        this.id = id;
        this.name = name;
        this.department = department;
        this.usageHours = usageHours;
        this.installationDate = installationDate;
        this.status = MachineStatus.OPERATIONAL;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getUsageHours() { return usageHours; }
    public LocalDate getInstallationDate() { return installationDate; }
    public MachineStatus getStatus() { return status; }

    public void setStatus(MachineStatus status) { this.status = status; }
    public void addUsageHours(int hours) {
        if (hours < 0) throw new IllegalArgumentException("Hours cannot be negative.");
        usageHours += hours;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + department +
                " | usage=" + usageHours + "h | status=" + status;
    }
}
