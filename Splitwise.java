import java.util.Scanner;

public class Splitwise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // get input from user

        boolean running = true; // used to change false when user exits

        while (running) { // execute until running = false

            System.out.println("=== Splitwise Console Backend ===");

            // Displaying menu
            System.out.println("1. Add expense");
            System.out.println("2. View expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt(); // get choice from user

            System.out.println();

            switch (choice) {

                case 1 -> {
                    System.out.println("Expense was recorded using current sample data");
                }

                case 2 -> {
                    System.out.println("--- Expense Summary ---");

                    String expname = "Dinner";
                    double totAmt = 1200.0;
                    int totmem = 4;

                    double eachshare = totAmt / totmem;

                    System.out.println("Expense name: " + expname);
                    System.out.println("Total amount: " + totAmt);
                    System.out.println("Number of people: " + totmem);
                    System.out.println("Each person should pay: " + eachshare);

                    System.out.println();

                    System.out.println("Feature status: Basic calculation completed.");
                }

                case 3 -> {
                    running = false;
                    System.out.println("Goodbye! Thank you for using Splitwise Console Backend.");
                }

                default -> {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}