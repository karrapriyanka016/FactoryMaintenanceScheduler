import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> jobs = new ArrayList<>();
    static ArrayList<String> machines = new ArrayList<>();
    static ArrayList<Integer> durations = new ArrayList<>();
    static ArrayList<Integer> priorities = new ArrayList<>();
    static ArrayList<Boolean> machineStatus = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== FACTORY MANAGEMENT SCHEDULER ===");
            System.out.println("1. Job Management");
            System.out.println("2. Machine Management");
            System.out.println("3. Scheduling");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                jobManagement();
            } else if (choice == 2) {
                machineManagement();
            } else if (choice == 3) {
                scheduling();
            } else if (choice == 4) {
                System.out.println("Program ended.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    static void jobManagement() {
        while (true) {
            System.out.println("\n--- JOB MANAGEMENT ---");
            System.out.println("1. Add Job");
            System.out.println("2. View Jobs");
            System.out.println("3. Delete Job");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter job name: ");
                jobs.add(sc.nextLine());
                System.out.print("Enter duration in hours: ");
                durations.add(sc.nextInt());
                System.out.print("Enter priority (1-High, 2-Medium, 3-Low): ");
                priorities.add(sc.nextInt());
                sc.nextLine();
                System.out.println("Job added successfully.");
            } else if (choice == 2) {
                if (jobs.isEmpty()) {
                    System.out.println("No jobs available.");
                } else {
                    for (int i = 0; i < jobs.size(); i++) {
                        System.out.println((i + 1) + ". " + jobs.get(i) + " | Duration: " + durations.get(i) + " hrs | Priority: " + priorities.get(i));
                    }
                }
            } else if (choice == 3) {
                if (jobs.isEmpty()) {
                    System.out.println("No jobs available.");
                } else {
                    viewJobs();
                    System.out.print("Enter job number to delete: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    if (n >= 1 && n <= jobs.size()) {
                        jobs.remove(n - 1);
                        durations.remove(n - 1);
                        priorities.remove(n - 1);
                        System.out.println("Job deleted successfully.");
                    } else {
                        System.out.println("Invalid job number.");
                    }
                }
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    static void machineManagement() {
        while (true) {
            System.out.println("\n--- MACHINE MANAGEMENT ---");
            System.out.println("1. Add Machine");
            System.out.println("2. View Machines");
            System.out.println("3. Change Machine Status");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter machine name: ");
                machines.add(sc.nextLine());
                machineStatus.add(true);
                System.out.println("Machine added successfully.");
            } else if (choice == 2) {
                if (machines.isEmpty()) {
                    System.out.println("No machines available.");
                } else {
                    for (int i = 0; i < machines.size(); i++) {
                        String status = machineStatus.get(i) ? "Available" : "Busy";
                        System.out.println((i + 1) + ". " + machines.get(i) + " | Status: " + status);
                    }
                }
            } else if (choice == 3) {
                if (machines.isEmpty()) {
                    System.out.println("No machines available.");
                } else {
                    for (int i = 0; i < machines.size(); i++) {
                        System.out.println((i + 1) + ". " + machines.get(i));
                    }

                    System.out.print("Enter machine number: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    if (n >= 1 && n <= machines.size()) {
                        int index = n - 1;
                        machineStatus.set(index, !machineStatus.get(index));
                        System.out.println("Machine status changed.");
                    } else {
                        System.out.println("Invalid machine number.");
                    }
                }
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    static void scheduling() {
        if (jobs.isEmpty()) {
            System.out.println("No jobs available.");
            return;
        }

        if (machines.isEmpty()) {
            System.out.println("No machines available.");
            return;
        }

        ArrayList<Integer> order = new ArrayList<>();

        for (int i = 0; i < jobs.size(); i++) {
            order.add(i);
        }

        order.sort((a, b) -> priorities.get(a) - priorities.get(b));

        System.out.println("\n--- FACTORY SCHEDULE ---");

        int time = 8;
        int machineIndex = 0;

        for (int index : order) {
            boolean found = false;

            for (int i = 0; i < machines.size(); i++) {
                int current = (machineIndex + i) % machines.size();

                if (machineStatus.get(current)) {
                    int end = time + durations.get(index);

                    System.out.println("Job: " + jobs.get(index));
                    System.out.println("Machine: " + machines.get(current));
                    System.out.println("Time: " + time + ":00 - " + end + ":00");
                    System.out.println("Priority: " + priorities.get(index));
                    System.out.println();

                    machineIndex = (current + 1) % machines.size();
                    time = end;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No available machine for " + jobs.get(index));
            }
        }
    }

    static void viewJobs() {
        for (int i = 0; i < jobs.size(); i++) {
            System.out.println((i + 1) + ". " + jobs.get(i) + " | Duration: " + durations.get(i) + " hrs | Priority: " + priorities.get(i));
        }
    }
}