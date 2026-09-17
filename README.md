# Factory Maintenance Scheduler

## Project Overview

Factory Maintenance Scheduler is a Java-based command-line application designed to help factories organize machine maintenance, record machine issues, and prioritize maintenance tasks.

The system uses machine usage, issue severity, and previous maintenance information to calculate a maintenance priority score. It also provides preventive maintenance plans and identifies machines that are due for maintenance.

## Objectives

- Manage factory machine information.
- Record and track machine issues.
- Maintain maintenance history.
- Calculate maintenance priority based on multiple factors.
- Create preventive maintenance schedules.
- Identify machines that are due or nearly due for maintenance.
- Generate maintenance summary reports.
- Store data using CSV files.

## Main Features

### 1. Machine Management
- Add and manage machine details.
- Track machine status and usage hours.
- View available machine information.

### 2. Issue Reporting
- Record faults and problems reported for machines.
- Assign severity levels to reported issues.
- Track issue information for maintenance planning.

### 3. Maintenance Records
- Store previous maintenance activities.
- Record maintenance dates and descriptions.
- Use maintenance history while planning future maintenance.

### 4. Maintenance Priority Calculation
The system calculates a priority score using factors such as:

- Issue severity
- Machine usage hours
- Number of days since the last maintenance

The calculated score helps identify machines that require earlier attention.

### 5. Preventive Maintenance Planning
- Define maintenance intervals based on machine usage.
- Set warning windows for upcoming maintenance.
- Display maintenance status as:
  - `DUE NOW`
  - `DUE SOON`
  - `OK`

### 6. Maintenance Reports
The application generates summary information about:

- Total machines
- Machine status
- Reported issues
- Maintenance activities
- Maintenance priorities

## Technologies Used

- **Java 17**
- **Maven**
- **JUnit 5**
- **CSV File Storage**
- **Object-Oriented Programming**

## Project Structure

```text
FactoryMaintenanceScheduler
│
├── README.md
├── statement.md
├── pom.xml
│
├── data
│   ├── machines.csv
│   ├── issues.csv
│   └── maintenance.csv
│
└── src
    ├── main
    │   └── java
    │       ├── Main.java
    │       │
    │       ├── model
    │       │   ├── Machine.java
    │       │   ├── MachineStatus.java
    │       │   ├── IssueReport.java
    │       │   ├── MaintenanceRecord.java
    │       │   ├── PriorityItem.java
    │       │   └── MaintenancePlan.java
    │       │
    │       ├── service
    │       │   ├── MachineService.java
    │       │   ├── MaintenanceService.java
    │       │   ├── MaintenancePriorityCalculator.java
    │       │   ├── ReportService.java
    │       │   └── MaintenancePlanService.java
    │       │
    │       └── util
    │           ├── InputValidator.java
    │           └── FileManager.java
    │
    └── test
        └── java
            └── FactoryMaintenanceTest.java
