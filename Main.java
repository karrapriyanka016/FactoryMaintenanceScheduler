import model.*;
import service.*;
import util.InputValidator;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MachineService machineService = new MachineService();
    private static final MaintenanceService maintenanceService = new MaintenanceService(machineService);
    private static final MaintenancePlanService planService = new MaintenancePlanService();
    private static final ReportService reportService =
            new ReportService(machineService, maintenanceService, planService);

    public static void main(String[] args) {
        printBanner();
        boolean running = true;

        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();

            try {
                switch (choice) {
                    case "1" -> addMachine();
                    case "2" -> listMachines();
                    case "3" -> reportIssue();
                    case "4" -> recordMaintenance();
                    case "5" -> showPriorityQueue();
                    case "6" -> setMaintenancePlan();
                    case "7" -> showDueStatus();
                    case "8" -> showReport();
                    case "0" -> running = false;
                    default -> System.out.println("Please choose a valid menu option.");
                }
            } catch (Exception e) {
                System.out.println("Action could not be completed: " + e.getMessage());
            }
        }

        System.out.println("Session closed. Maintenance data has been preserved.");
    }

    private static void printBanner() {
        System.out.println("""

                ==========================================
                   FACTORY MAINTENANCE SCHEDULER
                   Preventive Maintenance Console
                ==========================================
                """);
    }

    private static void printMenu() {
        System.out.println("""

                1. Register machine
                2. View machine register
                3. Report a fault
                4. Record completed maintenance
                5. View maintenance priority queue
                6. Set preventive-maintenance plan
                7. Check machine due status
                8. View factory summary
                0. Exit
                """);
        System.out.print("Select an option: ");
    }

    private static void addMachine() {
        System.out.print("Machine ID: ");
        String id = scanner.nextLine().trim();
        System.out.print("Machine name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Department: ");
        String department = scanner.nextLine().trim();
        int usage = InputValidator.readNonNegativeInt(scanner, "Current usage hours: ");

        machineService.addMachine(
                new Machine(id, name, department, usage, LocalDate.now()));

        System.out.println("Machine " + id + " registered successfully.");
    }

    private static void listMachines() {
        if (machineService.getMachines().isEmpty()) {
            System.out.println("No machines are registered yet.");
            return;
        }

        System.out.println("\n--- MACHINE REGISTER ---");
        machineService.getMachines().forEach(System.out::println);
    }

    private static void reportIssue() {
        System.out.print("Machine ID: ");
        String machineId = scanner.nextLine().trim();

        if (machineService.findById(machineId) == null) {
            throw new IllegalArgumentException("No machine exists with that ID.");
        }

        System.out.print("Fault description: ");
        String description = scanner.nextLine().trim();
        int severity = InputValidator.readRange(scanner, "Severity (1=low, 5=critical): ", 1, 5);

        maintenanceService.addIssue(
                new IssueReport(machineId, description, severity, LocalDate.now(), false));

        System.out.println("Fault logged. The priority queue has been updated.");
    }

    private static void recordMaintenance() {
        System.out.print("Machine ID: ");
        String machineId = scanner.nextLine().trim();
        System.out.print("Technician name: ");
        String technician = scanner.nextLine().trim();
        System.out.print("Work performed: ");
        String work = scanner.nextLine().trim();

        maintenanceService.addMaintenance(
                new MaintenanceRecord(machineId, LocalDate.now(), technician, work));

        System.out.println("Maintenance record saved.");
    }

    private static void showPriorityQueue() {
        System.out.println("\n--- PRIORITY QUEUE ---");
        maintenanceService.getPriorityQueue().forEach(item ->
                System.out.printf("%-8s | priority=%-3d | %s%n",
                        item.machine().getId(), item.score(), item.reason()));
    }

    private static void setMaintenancePlan() {
        System.out.print("Machine ID: ");
        String machineId = scanner.nextLine().trim();

        if (machineService.findById(machineId) == null) {
            throw new IllegalArgumentException("No machine exists with that ID.");
        }

        int interval = InputValidator.readNonNegativeInt(
                scanner, "Service interval (hours): ");
        int warning = InputValidator.readNonNegativeInt(
                scanner, "Warning window (hours): ");

        planService.setPlan(new MaintenancePlan(machineId, interval, warning));
        System.out.println("Preventive-maintenance plan saved.");
    }

    private static void showDueStatus() {
        System.out.print("Machine ID: ");
        String id = scanner.nextLine().trim();
        Machine machine = machineService.findById(id);

        if (machine == null) {
            System.out.println("Machine not found.");
            return;
        }

        System.out.println(machine.getId() + " -> " + planService.checkDueStatus(machine));
    }

    private static void showReport() {
        System.out.println(reportService.generateSummary());
    }
}
