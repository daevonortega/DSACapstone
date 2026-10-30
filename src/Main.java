import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Integer> ticketNumbers = new ArrayList<>();
    static ArrayList<String> requesterNames = new ArrayList<>();
    static ArrayList<String> technicalIssues = new ArrayList<>();

    static Queue<Integer> ticketQueue = new LinkedList<>();

    static int nextTicketNumber = 1001;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n==================================");
            System.out.println("       IT HELP DESK SYSTEM");
            System.out.println("==================================");
            System.out.println("1. Add New Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. View Next Ticket");
            System.out.println("4. Display Ticket Queue");
            System.out.println("5. Display All Tickets");
            System.out.println("6. Sort by Ticket Number");
            System.out.println("7. Sort by Requester Name");
            System.out.println("8. Search Ticket");
            System.out.println("9. Exit");
            System.out.println("==================================");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    addTicket();
                    break;

                case 2:
                    processTicket();
                    break;

                case 3:
                    viewNextTicket();
                    break;

                case 4:
                    displayQueue();
                    break;

                case 5:
                    displayAllTickets();
                    break;

                case 6:
                    bubbleSort();
                    break;

                case 7:
                    selectionSort();
                    break;

                case 8:
                    searchTicket();
                    break;

                case 9:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 9);
    }

    static int readInteger(String message) {

        while (true) {
            System.out.print(message);

            try {
                return Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    static void addTicket() {

        System.out.println("\n--- ADD NEW TICKET ---");

        System.out.print("Enter requester name: ");
        String name = input.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.print("Enter technical issue: ");
        String issue = input.nextLine().trim();

        if (issue.isEmpty()) {
            System.out.println("Issue cannot be empty.");
            return;
        }

        int ticketNumber = nextTicketNumber++;

        ticketNumbers.add(ticketNumber);
        requesterNames.add(name);
        technicalIssues.add(issue);

        ticketQueue.offer(ticketNumber);

        System.out.println("\nTicket successfully added!");
        System.out.println("Ticket Number: " + ticketNumber);
    }

    static void processTicket() {

        if (ticketQueue.isEmpty()) {
            System.out.println("\nNo tickets waiting to be processed.");
            return;
        }

        int ticketNumber = ticketQueue.poll();

        int index = ticketNumbers.indexOf(ticketNumber);

        System.out.println("\n--- PROCESSING TICKET ---");
        System.out.println("Ticket Number: " + ticketNumbers.get(index));
        System.out.println("Requester: " + requesterNames.get(index));
        System.out.println("Issue: " + technicalIssues.get(index));

        System.out.println("\nTicket successfully processed!");
    }

    static void viewNextTicket() {

        if (ticketQueue.isEmpty()) {
            System.out.println("\nNo tickets in the queue.");
            return;
        }

        int ticketNumber = ticketQueue.peek();

        int index = ticketNumbers.indexOf(ticketNumber);

        System.out.println("\n--- NEXT TICKET ---");
        System.out.println("Ticket Number: " + ticketNumbers.get(index));
        System.out.println("Requester: " + requesterNames.get(index));
        System.out.println("Issue: " + technicalIssues.get(index));
    }

    static void displayQueue() {

        if (ticketQueue.isEmpty()) {
            System.out.println("\nThe ticket queue is empty.");
            return;
        }

        System.out.println("\n--- TICKET QUEUE (FIFO) ---");

        for (int ticketNumber : ticketQueue) {

            int index = ticketNumbers.indexOf(ticketNumber);

            System.out.println(
                    "Ticket #" + ticketNumber +
                            " - " + requesterNames.get(index)
            );
        }
    }

    static void displayAllTickets() {

        if (ticketNumbers.isEmpty()) {
            System.out.println("\nNo tickets recorded.");
            return;
        }

        System.out.println("\n--- ALL TICKETS ---");

        for (int i = 0; i < ticketNumbers.size(); i++) {

            System.out.println("\nTicket Number: " + ticketNumbers.get(i));
            System.out.println("Requester: " + requesterNames.get(i));
            System.out.println("Issue: " + technicalIssues.get(i));
        }
    }

    // BUBBLE SORT: Sort by ticket number

    static void bubbleSort() {

        int size = ticketNumbers.size();

        if (size == 0) {
            System.out.println("\nNo tickets to sort.");
            return;
        }

        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - i - 1; j++) {

                if (ticketNumbers.get(j) > ticketNumbers.get(j + 1)) {

                    swapTickets(j, j + 1);
                }
            }
        }

        System.out.println("\nTickets sorted by ticket number using Bubble Sort.");
        displayAllTickets();
    }

    // SELECTION SORT: Sort by requester name

    static void selectionSort() {

        int size = requesterNames.size();

        if (size == 0) {
            System.out.println("\nNo tickets to sort.");
            return;
        }

        for (int i = 0; i < size - 1; i++) {

            int minimumIndex = i;

            for (int j = i + 1; j < size; j++) {

                if (requesterNames.get(j).compareToIgnoreCase(
                        requesterNames.get(minimumIndex)) < 0) {

                    minimumIndex = j;
                }
            }

            swapTickets(i, minimumIndex);
        }

        System.out.println("\nTickets sorted by requester name using Selection Sort.");
        displayAllTickets();
    }

    // Swap corresponding ticket information

    static void swapTickets(int first, int second) {

        int tempNumber = ticketNumbers.get(first);
        ticketNumbers.set(first, ticketNumbers.get(second));
        ticketNumbers.set(second, tempNumber);

        String tempName = requesterNames.get(first);
        requesterNames.set(first, requesterNames.get(second));
        requesterNames.set(second, tempName);

        String tempIssue = technicalIssues.get(first);
        technicalIssues.set(first, technicalIssues.get(second));
        technicalIssues.set(second, tempIssue);
    }

    // SEARCH TICKET

    static void searchTicket() {

        if (ticketNumbers.isEmpty()) {
            System.out.println("\nNo tickets available to search.");
            return;
        }

        int searchNumber = readInteger("\nEnter ticket number to search: ");

        int index = ticketNumbers.indexOf(searchNumber);

        if (index != -1) {

            System.out.println("\n--- TICKET FOUND ---");
            System.out.println("Ticket Number: " + ticketNumbers.get(index));
            System.out.println("Requester: " + requesterNames.get(index));
            System.out.println("Issue: " + technicalIssues.get(index));

        } else {

            System.out.println("\nTicket not found.");
        }
    }
}