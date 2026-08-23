public class SplitwiseApp {

    public static void main(String[] args) {

        // 1. Print heading
        System.out.println("=== Splitwise Console Backend ===");

        // 2. Store expense description
        String expenseDescription = "Dinner";

        // 3. Store total expense amount
        double totalAmount = 1200.0;

        // 4. Store number of people
        int numberOfPeople = 4;

        // 5. Calculate equal share
        double eachPersonShare = totalAmount / numberOfPeople;

        // 6. Print summary
        System.out.println("Expense description: " + expenseDescription);
        System.out.println("Total amount: " + totalAmount);
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Each person should pay: " + eachPersonShare);
        System.out.println("Feature status: Basic calculation completed.");
    }
}