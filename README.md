# Factory Management Scheduler

## 1. Project Overview

The Factory Management Scheduler is a simple Java-based command-line application designed to help manage basic factory production activities.

In a factory, several jobs may need to be completed using different machines. Managing these jobs manually can make it difficult to keep track of priorities, machine availability, and working time. This project provides a simple way to organize production jobs and generate a schedule.

The application allows users to manage production jobs, manage factory machines, and create a schedule based on job priority and duration.

## 2. Problem Statement

Managing production jobs manually can lead to confusion about which job should be completed first and which machines are available for production. A simple scheduling system can help organize these tasks and make the production process easier to manage.

The Factory Management Scheduler provides a basic command-line solution where users can add jobs, manage machines, check their availability, and generate a production schedule.

## 3. Objectives

* To create a simple factory scheduling system using Java.
* To manage production jobs efficiently.
* To maintain information about factory machines.
* To check machine availability.
* To arrange jobs based on their priority.
* To generate a simple production schedule.
* To demonstrate Java programming concepts through a practical application.

## 4. Main Modules

### 4.1 Job Management

This module manages production jobs.

Functions include:

* Add a new job
* View all jobs
* Delete a job
* Set job duration
* Set job priority

Each job contains:

* Job name
* Duration
* Priority

Priority levels are:

```text
1 - High
2 - Medium
3 - Low
```

### 4.2 Machine Management

This module manages the machines available in the factory.

Functions include:

* Add a machine
* View machines
* Check machine status
* Change machine status

A machine can have two statuses:

```text
Available
Busy
```

### 4.3 Scheduling

This module generates the production schedule.

The system:

1. Checks whether jobs are available.
2. Checks whether machines are available.
3. Arranges jobs according to priority.
4. Assigns available machines.
5. Calculates the starting time.
6. Calculates the ending time.
7. Displays the final schedule.

## 5. Technologies Used

* Java
* Java Collections Framework
* ArrayList
* Scanner
* Command Line Interface

## 6. Requirements

The following software is required:

* Java JDK 8 or later
* Command Prompt or Terminal
* VS Code, IntelliJ IDEA, Eclipse, or any Java-supported editor

No external libraries are required.

## 7. Project Structure

The project is intentionally kept simple and contains only one Java source file.

```text
FactoryManagementScheduler/
│
├── Main.java
└── README.md
```

All three modules are implemented inside `Main.java`.

## 8. Installation and Setup

### Step 1: Download the Project

Download or clone the project repository from GitHub.

### Step 2: Open the Project Folder

Open the project folder in VS Code or a terminal.

### Step 3: Check Java Installation

Run:

```bash
java -version
```

Then check the Java compiler:

```bash
javac -version
```

If both commands display a Java version, the setup is ready.

## 9. Compilation

Open the terminal inside the project folder and run:

```bash
javac Main.java
```

If there are no errors, the program has been successfully compiled.

## 10. Running the Application

Run the following command:

```bash
java Main
```

The main menu will appear:

```text
=== FACTORY MANAGEMENT SCHEDULER ===
1. Job Management
2. Machine Management
3. Scheduling
4. Exit
Enter choice:
```

## 11. How to Use the Application

### Step 1: Add Machines

Select:

```text
2. Machine Management
```

Then select:

```text
1. Add Machine
```

Enter the machine name.

Example:

```text
Enter machine name: CNC Machine
Machine added successfully.
```

New machines are initially marked as available.

### Step 2: Add Jobs

Select:

```text
1. Job Management
```

Then select:

```text
1. Add Job
```

Enter the job details.

Example:

```text
Enter job name: Gear Production
Enter duration in hours: 3
Enter priority (1-High, 2-Medium, 3-Low): 1
Job added successfully.
```

### Step 3: View Jobs

Select:

```text
1. Job Management
2. View Jobs
```

The application displays the available jobs with their duration and priority.

### Step 4: Generate Schedule

Select:

```text
3. Scheduling
```

The system sorts the jobs according to priority and assigns available machines.

Example:

```text
--- FACTORY SCHEDULE ---

Job: Gear Production
Machine: CNC Machine
Time: 8:00 - 11:00
Priority: 1
```

## 12. Example Workflow

A typical workflow is:

```text
Start
  ↓
Add Machines
  ↓
Add Production Jobs
  ↓
Set Job Priority
  ↓
Check Machine Availability
  ↓
Generate Schedule
  ↓
View Production Schedule
  ↓
Exit
```

## 13. Java Concepts Used

The project demonstrates several basic Java concepts:

### Variables and Data Types

Used to store job names, machine names, durations, priorities, and statuses.

### Methods

Different methods are used for job management, machine management, and scheduling.

### ArrayList

`ArrayList` is used to store jobs, machines, durations, priorities, and machine statuses.

### Conditional Statements

`if-else` statements are used to process menu choices and validate user input.

### Loops

Loops are used to display jobs and machines and process the scheduling system.

### Sorting

Jobs are sorted according to their priority before the schedule is generated.

### Scanner

The `Scanner` class is used to accept input from the user through the terminal.

## 14. Input and Output

### Input

The user provides:

* Menu choice
* Job name
* Job duration
* Job priority
* Machine name
* Machine status

### Output

The application displays:

* Job information
* Machine information
* Machine availability
* Production schedule
* Start and end times

## 15. Limitations

The current version has some limitations:

* Data is not permanently stored.
* Data is lost when the program is closed.
* Scheduling uses a simple priority-based approach.
* There is no graphical user interface.
* Worker management is not included.

## 16. Future Enhancements

The project can be improved by adding:

* File-based data storage
* Database connectivity
* Worker management
* Production quantity tracking
* Daily and weekly scheduling
* Improved scheduling algorithms
* Production reports
* Machine maintenance tracking
* Graphical user interface

## 17. Advantages

* Simple to use
* Easy to run from the command line
* No external libraries required
* Helps organize production jobs
* Considers job priority
* Tracks basic machine availability
* Demonstrates practical Java programming

## 18. Conclusion

The Factory Management Scheduler provides a simple way to organize factory production jobs and machines using Java. It combines job management, machine management, and priority-based scheduling in one command-line application.

The project demonstrates how basic Java programming concepts can be applied to a practical problem while keeping the application simple and easy to operate.

## 19. Author

**Karra Priyanka**

Programming in Java
VIT Bhopal University
