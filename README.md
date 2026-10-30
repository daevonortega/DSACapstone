IT Help Desk Ticketing System

1. Project Title

IT Help Desk Ticketing System Using Sorting Algorithms and Queues

2. Project Description

The IT Help Desk Ticketing System is a console-based Java application designed to manage technical support requests from students or employees.

The system allows users to create support tickets, store ticket information, search for records, and process requests in the order they were received.

It uses Queue data structures to manage incoming support tickets following the First-In, First-Out (FIFO) principle. It also implements Bubble Sort and Selection Sort to organize ticket records based on ticket number and requester name.

This application helps demonstrate how sorting algorithms and queue data structures can be used to organize and manage real-world support requests.

3. Project Objectives

The main objectives of this application are:

* To create and manage IT help desk support tickets.
* To implement sorting algorithms to organize ticket records.
* To apply queue operations using the FIFO principle.
* To use Java ArrayLists to store and manage ticket information.
* To provide searching functionality for ticket records.
* To demonstrate the use of loops, conditional statements, methods, and input validation.
* To develop a functional console-based Java application.

4. Use Cases and Features

The system provides the following features:

4.1 Add New Ticket

Allows users to create a new support ticket by entering the requester’s name and technical issue. Each ticket receives a unique ticket number and is automatically added to the queue.

4.2 Process Next Ticket

Processes the next available support ticket based on the order it was received. The system follows the FIFO principle.

4.3 View Next Ticket

Displays the next ticket waiting to be processed without removing it from the queue.

4.4 Display Ticket Queue

Shows all tickets currently waiting to be processed.

4.5 Display All Tickets

Displays all registered ticket records, including their ticket numbers, requester names, and technical issues.

4.6 Sort by Ticket Number

Uses Bubble Sort to arrange ticket records in ascending order based on their ticket numbers.

4.7 Sort by Requester Name

Uses Selection Sort to arrange ticket records alphabetically based on requester names.

4.8 Search Ticket

Allows users to search for a specific ticket using its ticket number.

4.9 Input Validation

The system checks invalid menu inputs and prevents empty requester names and technical issues.

5. Data Structure Explanation

5.1 ArrayList

The application uses three ArrayLists to store related ticket information:

* ticketNumbers – Stores the unique ticket numbers.
* requesterNames – Stores the names of the people requesting technical support.
* technicalIssues – Stores the technical problems reported by requesters.

These ArrayLists use corresponding indexes to keep related ticket information together.

For example, the information stored at index 0 in all three ArrayLists belongs to the same ticket.

5.2 Queue

The application uses Java’s Queue interface with a LinkedList implementation to manage incoming support tickets.

The queue stores ticket numbers and follows the First-In, First-Out (FIFO) principle.

This means the first ticket added to the queue will be the first ticket processed.

6. Sorting Algorithm Explanation

The application implements two sorting algorithms manually without using Java’s built-in sorting methods.

6.1 Bubble Sort

Bubble Sort is used to arrange ticket records in ascending order based on ticket numbers.

It repeatedly compares two neighboring ticket numbers and swaps their positions when they are in the wrong order.

This process continues until the records are sorted.

Purpose: To organize support tickets by their ticket numbers.

6.2 Selection Sort

Selection Sort is used to arrange ticket records alphabetically based on requester names.

It repeatedly finds the alphabetically smallest name from the unsorted portion of the records and places it in the correct position.

Purpose: To organize support tickets by requester name, making records easier to locate.

6.3 Maintaining Related Records

Whenever two tickets are swapped during sorting, their corresponding ticket numbers, requester names, and technical issues are also swapped.

This ensures that all related information remains associated with the correct ticket.

Sorting the ArrayLists does not change the existing queue processing order.

7. Queue Operations Explanation

The application uses the following queue operations:

Operation	Description
Enqueue (offer)	Adds a new ticket number to the queue.
Dequeue (poll)	Removes and processes the next ticket.
Peek (peek)	Views the next ticket without removing it.
Display Queue	Shows all tickets waiting to be processed.
isEmpty (isEmpty)	Checks whether the queue contains any tickets.

FIFO Example

If the following tickets are added:

1. Ticket 1001
2. Ticket 1002
3. Ticket 1003

The processing order will be:

1. Ticket 1001
2. Ticket 1002
3. Ticket 1003

This demonstrates the First-In, First-Out principle.

8. How to Run the Program

Using IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Open the DSACapstone project.
3. Navigate to the src folder.
4. Open Main.java.
5. Locate the main method.
6. Click the green Run button.
7. The IT Help Desk Ticketing System menu will appear in the console.
8. Enter a number corresponding to the operation you want to perform.

Using Terminal

Make sure Java is installed on your computer.

From the project root folder, compile the program:

javac src/Main.java

Run the program:

java -cp src Main

9. Technologies Used

* Programming Language: Java
* IDE: IntelliJ IDEA
* Data Structures: ArrayList and Queue
* Queue Implementation: LinkedList
* Sorting Algorithms: Bubble Sort and Selection Sort
* Version Control: Git
* Repository Hosting: GitHub

10. Screenshots of the System

Actual screenshots of the running application will be included below.

10.1 Main Menu

Shows the main menu and available system operations.

10.2 Adding and Displaying Tickets

Shows how users create new support tickets and display registered records.

10.3 Queue Operations

Shows the enqueue, peek, dequeue, and display queue operations.

10.4 FIFO Demonstration

Shows that tickets are processed in the same order they were added.

10.5 Bubble Sort

Shows ticket records before and after sorting by ticket number.

10.6 Selection Sort

Shows ticket records before and after sorting alphabetically by requester name.

10.7 Input Validation

Shows how the application handles invalid menu selections and empty inputs.

11. Repository

The project source code and documentation are available on GitHub.

Repository Name: DSACapstone

GitHub Username: daevonortega

⸻

End of Documentation