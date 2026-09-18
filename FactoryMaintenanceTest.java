import service.MaintenancePriorityCalculator;

public class FactoryMaintenanceTest {
    public static void main(String[] args) {
        MaintenancePriorityCalculator c = new MaintenancePriorityCalculator();

        int high = c.calculate(5, 1000, 60);
        int low = c.calculate(1, 100, 7);

        if (high <= low) throw new AssertionError("High-risk machine should have higher priority.");
        if (c.calculate(0, 0, 0) != 0) throw new AssertionError("Zero inputs should produce zero score.");

        System.out.println("All tests passed.");
    }
}
