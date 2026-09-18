# Factory Maintenance Scheduler

A command-line Java application for managing factory machines, maintenance records, reported faults, maintenance priorities, and maintenance schedules.

## Problem
Factories may operate many machines with different usage levels and maintenance histories. A simple record system can make it difficult to decide which machine should be serviced first. This project provides a centralized CLI system that stores machine information, records faults and maintenance, calculates a maintenance priority score, and generates reports.

## Features
- Add and view machines
- Record machine faults/issues
- Record completed maintenance
- Calculate maintenance priority using severity, usage hours, and days since last maintenance
- Generate a prioritized maintenance queue
- View factory summary reports
- Persistent CSV storage
- Input validation and error handling

## Technology
- Java 17+
- Maven
- Object-Oriented Programming
- Java Collections
- File I/O with CSV files
- Command-line interface

## Requirements
- JDK 17 or newer
- Maven 3.8+ (recommended)

## Run
From the project root:

```bash
mvn clean package
java -cp target/classes Main
```

If Maven is unavailable, compile directly:

```bash
javac -d out $(find src/main/java -name "*.java")
java -cp out Main
```

On Windows PowerShell, an alternative is:

```powershell
Get-ChildItem -Recurse src/main/java -Filter *.java | ForEach-Object { $_.FullName } | Set-Content sources.txt
javac -d out @sources.txt
java -cp out Main
```

## Test
Run:

```bash
mvn test
```

The project also contains a lightweight Java test runner under `src/test/java/FactoryMaintenanceTest.java`.

## Data
Runtime CSV files are created in the `data/` directory:
- `machines.csv`
- `issues.csv`
- `maintenance.csv`

## Project structure

```text
FactoryMaintenanceScheduler/
├── pom.xml
├── README.md
├── statement.md
├── src/
│   ├── main/java/
│   │   ├── Main.java
│   │   ├── model/
│   │   ├── service/
│   │   └── util/
│   └── test/java/
└── data/
```

