package Lab_Switch;

public class LabD {
    public static void main(String[] args) {
        int choice = 2;

        String message = switch (choice) {
            case 1 -> "Add";
            case 2 -> "View";
            case 3 -> "Exit";
            default -> "Invalid";
        };

        System.out.println(message);
    }
}
