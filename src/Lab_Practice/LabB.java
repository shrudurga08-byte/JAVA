package Lab_Practice;
// Constants
public class LabB {
    public static void main(String[] args) {

        final double TAX_RATE = 0.18;

        double amount = 1000.0;

        double tax = amount * TAX_RATE;

        // TAX_RATE = 0.20;// Cannot assign a value to final variable 'TAX_RATE'

        System.out.println("Tax Rate: " + TAX_RATE);
        System.out.println("Amount: " + amount);
        System.out.println("Tax: " + tax);
    }
}