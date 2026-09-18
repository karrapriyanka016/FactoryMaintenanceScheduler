# FACTORY MANAGEMENT SCHEDULER

## 1. Introduction

Factories handle multiple production activities every day. Different jobs have to be completed within a certain amount of time, and these jobs may require different machines. When the number of jobs increases, managing them manually can become difficult. Workers or managers need to know which jobs are pending, which machines are available, how long each job will take, and which job should be handled first.

The **Factory Management Scheduler** is a simple Java-based command-line application developed to organize these basic production activities. The system provides a structured way to manage production jobs and factory machines and to generate a simple production schedule.

The project focuses on three main areas: **Job Management, Machine Management, and Scheduling**. Users can add and manage production jobs, maintain information about available machines, and generate a schedule based on the priority and duration of the jobs.

The application is designed to be simple and easy to operate. It does not require a graphical interface, database, or external libraries. All operations can be performed directly through the command line.

---

## 2. Background

Production scheduling is an important part of factory operations because several activities may need to be coordinated at the same time. A production job may have a specific duration and priority, while the machines required for production may not always be available.

For a small factory or a basic production environment, a simple scheduling system can help organize this information. Instead of maintaining job details manually, the user can enter them into the application and generate a schedule based on the entered information.

This project applies basic Java programming concepts to this practical situation. It provides a small-scale example of how programming can be used to organize factory production activities.

---

## 3. Problem Statement

Managing production jobs and machines manually can make it difficult to maintain an organized production process. When several jobs are present, there may be confusion about which job should be completed first, how long each job will take, and which machine is currently available.

There is therefore a need for a simple system that can:

* Maintain production job information.
* Store job duration and priority.
* Maintain a list of factory machines.
* Track basic machine availability.
* Arrange production jobs according to priority.
* Assign available machines to scheduled jobs.
* Calculate and display the expected start and end time.

The **Factory Management Scheduler** addresses these requirements through a simple command-line application developed using Java.

---

## 4. Aim of the Project

The main aim of this project is to develop a simple Java application that can organize factory production jobs and machines and generate a basic schedule based on job priority, duration, and machine availability.

---

## 5. Objectives

The project has the following objectives:

1. To develop a simple factory management application using Java.
2. To provide an easy method for adding and managing production jobs.
3. To maintain information about factory machines.
4. To track whether machines are available or busy.
5. To allow users to delete unnecessary production jobs.
6. To assign priorities to production jobs.
7. To arrange jobs based on their priority.
8. To assign available machines to scheduled jobs.
9. To calculate job starting and ending times.
10. To display the production schedule clearly through the command line.
11. To demonstrate the practical use of Java programming concepts.

---

## 6. Scope of the Project

The scope of the project is focused on basic factory production scheduling.

### 6.1 Job Management

The system allows users to:

* Add production jobs.
* View existing jobs.
* Delete jobs.
* Enter job duration.
* Assign priority to each job.

### 6.2 Machine Management

The system allows users to:

* Add factory machines.
* View available machines.
* Check machine status.
* Change machine status between available and busy.

### 6.3 Scheduling

The scheduling module:

* Checks whether jobs are available.
* Checks machine availability.
* Sorts jobs based on priority.
* Assigns available machines.
* Calculates start and end times.
* Displays the final schedule.

The current project focuses on basic scheduling and does not attempt to model the complete operations of a real industrial factory.

---

# 7. System Modules

The application is divided into three main modules.

## 7.1 Module 1: Job Management

The Job Management module handles all basic operations related to production jobs.

### Functions

**Add Job**

The user can enter a new production job by providing:

* Job name
* Duration
* Priority

**View Jobs**

The system displays all jobs currently stored in the application.

**Delete Job**

The user can select a job number and remove it from the list.

### Priority System

Each job is assigned one of three priority levels:

| Priority | Meaning |
| -------- | ------- |
| 1        | High    |
| 2        | Medium  |
| 3        | Low     |

Jobs with higher priority are considered earlier when generating the schedule.

---

## 7.2 Module 2: Machine Management

The Machine Management module maintains the machines used for production.

### Functions

**Add Machine**

The user can enter the name of a machine and add it to the factory's machine list.

**View Machines**

The system displays all registered machines along with their current status.

**Change Machine Status**

The user can change a machine's status between:

* Available
* Busy

This allows the scheduling module to consider basic machine availability before assigning a job.

---

## 7.3 Module 3: Scheduling

The Scheduling module combines the information entered through the Job Management and Machine Management modules.

The scheduling process follows these basic steps:

1. Check whether production jobs exist.
2. Check whether factory machines exist.
3. Arrange jobs according to their priority.
4. Search for an available machine.
5. Assign the machine to the job.
6. Calculate the starting time.
7. Calculate the ending time using the job duration.
8. Display the scheduled job.

The schedule begins from the defined starting working time and continues according to the duration of each scheduled job.

---

# 8. System Workflow

The overall workflow of the application is:

```text
                    START
                      |
                      v
              Main Menu
                      |
          +-----------+-----------+
          |           |           |
          v           v           v
    Job Management  Machine     Scheduling
                    Management
          |           |           |
          v           v           |
       Add/View/   Add/View/      |
       Delete      Status         |
          |           |           |
          +-----------+-----------+
                      |
                      v
             Check Job & Machine
                      |
                      v
              Sort Jobs by
                 Priority
                      |
                      v
             Assign Available
                 Machine
                      |
                      v
             Calculate Time
                      |
                      v
             Display Schedule
                      |
                      v
                     END
```

---

# 9. System Inputs

The application accepts the following information from the user.

### Job Inputs

* Job name
* Job duration
* Job priority

### Machine Inputs

* Machine name
* Machine status

### Menu Input

The user selects the required operation by entering the corresponding menu number.

---

# 10. System Outputs

The application provides the following outputs:

* List of production jobs.
* Job duration and priority.
* List of factory machines.
* Machine availability status.
* Generated production schedule.
* Job start time.
* Job end time.
* Assigned machine.

---

# 11. Technologies Used

The project uses basic Java technologies and does not require external libraries.

### Programming Language

**Java**

Java is used to implement the complete application and handle the input, processing, data management, and output.

### Java Collections

`ArrayList` is used to maintain lists of jobs, machines, durations, priorities, and machine statuses.

### Scanner

The `Scanner` class is used to receive input from the user through the command line.

### Command Line Interface

The application operates completely through the terminal, making it easy to compile and execute.

---

# 12. Java Concepts Implemented

The project demonstrates several fundamental Java concepts.

## 12.1 Variables and Data Types

Variables are used to store information such as:

* Job names
* Machine names
* Duration
* Priority
* Machine status
* Menu choices

## 12.2 Methods

Separate methods are used to organize different operations of the application, such as:

* Adding jobs
* Viewing jobs
* Deleting jobs
* Managing machines
* Generating schedules

This makes the program easier to understand and maintain.

## 12.3 ArrayList

`ArrayList` is used for dynamic storage of jobs and machines. It allows the application to add or remove information during execution.

## 12.4 Conditional Statements

`if-else` statements are used for:

* Processing menu choices.
* Checking whether jobs exist.
* Checking whether machines exist.
* Validating job and machine numbers.
* Checking machine availability.

## 12.5 Loops

Loops are used to:

* Display jobs.
* Display machines.
* Search for available machines.
* Process multiple jobs during scheduling.

## 12.6 Sorting

The jobs are sorted according to their priority before the production schedule is generated.

## 12.7 User Input

The `Scanner` class allows the user to interact with the application directly through the terminal.

---

# 13. Functional Requirements

The system should be able to perform the following functions:

### Job Management

* Add a job.
* View jobs.
* Delete a job.
* Store duration.
* Store priority.

### Machine Management

* Add a machine.
* View machines.
* Display machine status.
* Change machine status.

### Scheduling

* Identify available jobs.
* Identify available machines.
* Sort jobs by priority.
* Assign machines.
* Calculate production times.
* Display the schedule.

---

# 14. Non-Functional Requirements

The project also focuses on basic usability and simplicity.

### Simplicity

The application uses a straightforward menu-based interface.

### Accessibility

The program can be run from a normal command-line terminal.

### Portability

Since the application uses standard Java features, it can run on systems with a compatible Java JDK.

### Maintainability

The use of separate methods for different operations makes the code easier to modify and extend.

---

# 15. Sample Application Flow

A typical session can begin by adding factory machines:

```text
Enter choice: 2

--- MACHINE MANAGEMENT ---
1. Add Machine
2. View Machines
3. Change Machine Status
4. Back

Enter choice: 1
Enter machine name: CNC Machine
Machine added successfully.
```

The user can then add a production job:

```text
Enter choice: 1

--- JOB MANAGEMENT ---
1. Add Job
2. View Jobs
3. Delete Job
4. Back

Enter choice: 1
Enter job name: Gear Production
Enter duration in hours: 3
Enter priority (1-High, 2-Medium, 3-Low): 1
Job added successfully.
```

After adding the required jobs and machines, the user can generate the schedule:

```text
Enter choice: 3

--- FACTORY SCHEDULE ---

Job: Gear Production
Machine: CNC Machine
Time: 8:00 - 11:00
Priority: 1
```

This provides a simple view of the planned production activity.

---

# 16. Advantages

The project provides several advantages for a basic factory scheduling environment:

* Simple command-line operation.
* Easy job entry and management.
* Basic machine availability tracking.
* Priority-based job arrangement.
* Automatic calculation of job timing.
* No external libraries are required.
* Easy to compile and execute.
* Demonstrates practical use of Java programming.
* Can be extended with additional features in the future.

---

# 17. Limitations

The current version is designed as a basic academic project and therefore has some limitations.

* Information is stored only during program execution.
* Data is lost when the application is closed.
* The scheduling algorithm is simple and priority-based.
* The application does not use a database.
* Worker management is not included.
* Production quantities are not tracked.
* There is no graphical user interface.
* Machine maintenance information is not included.
* The current system does not model multiple production shifts.

These limitations leave room for future improvements.

---

# 18. Future Enhancements

The system can be extended in several ways.

### Data Storage

File handling or a database can be introduced so that jobs and machine information remain available after restarting the application.

### Worker Management

A worker management module can be added to assign workers to production jobs.

### Production Tracking

The system can be extended to track production quantities and completed jobs.

### Advanced Scheduling

More advanced scheduling algorithms can be implemented to consider machine capacity, working shifts, job deadlines, and multiple machines.

### Reports

The system can generate production reports showing completed jobs, pending jobs, machine usage, and production hours.

### Graphical Interface

A GUI can be added to make the application more visual and interactive.

---

# 19. Testing Approach

The application can be tested by performing different operations through the command line.

### Test Case 1: Add Job

**Input:** Valid job name, duration, and priority.

**Expected Result:** The job is added successfully.

### Test Case 2: View Jobs

**Input:** Select View Jobs.

**Expected Result:** All stored jobs are displayed.

### Test Case 3: Delete Job

**Input:** Select a valid job number.

**Expected Result:** The selected job is removed.

### Test Case 4: Add Machine

**Input:** Enter a machine name.

**Expected Result:** The machine is added with Available status.

### Test Case 5: Change Machine Status

**Input:** Select a machine.

**Expected Result:** The machine status changes between Available and Busy.

### Test Case 6: Generate Schedule

**Input:** Add multiple jobs and available machines.

**Expected Result:** Jobs are arranged according to priority and available machines are assigned.

### Test Case 7: Empty Job List

**Input:** Select Scheduling without adding jobs.

**Expected Result:** The system displays that no jobs are available.

### Test Case 8: Empty Machine List

**Input:** Select Scheduling without adding machines.

**Expected Result:** The system displays that no machines are available.

---

# 20. Expected Result

After successful execution, the application should allow the user to manage factory jobs and machines through the terminal and generate a basic production schedule.

The final schedule should show:

```text
Job Name
Machine Name
Start Time
End Time
Priority
```

This allows the user to understand the order in which the production jobs have been scheduled.

---

# 21. Project Structure

The project is intentionally kept compact and contains a single Java source file.

```text
FactoryManagementScheduler/
│
├── Main.java
└── README.md
```

The `Main.java` file contains the complete implementation of the three modules.

---

# 22. Execution

The project can be compiled using:

```bash
javac Main.java
```

The application can then be started using:

```bash
java Main
```

No additional Java libraries or external dependencies are required.

---

# 23. Conclusion

The **Factory Management Scheduler** is a simple application developed to demonstrate how Java programming can be applied to a practical production management problem.

The system combines three important functions: **Job Management, Machine Management, and Scheduling**. Users can enter production jobs, assign priorities and durations, manage machine availability, and generate a schedule using the available information.

Although the current implementation is intentionally simple, it provides a foundation that can be expanded with permanent data storage, worker management, production tracking, advanced scheduling, reporting, and graphical interfaces.

Overall, the project provides practical experience with Java programming concepts such as `ArrayList`, methods, loops, conditional statements, sorting, user input, and command-line interaction while addressing a basic factory scheduling requirement.
