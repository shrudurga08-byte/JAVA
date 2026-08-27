package String;

public class StringMethodsDemo {
    public static void main(String[] args) {
        // length()
        System.out.println("Riya".length()); // Outputs: 4

        // isEmpty()
        System.out.println("".isEmpty()); // Outputs: true

        // isBlank() (Java 11+)
        System.out.println(" ".isBlank()); // Outputs: true

        // strip()
        System.out.println(" Riya ".strip()); // Outputs: Riya

        // equals(other)
        System.out.println("Riya".equals("Riya")); // Outputs: true

        // equalsIgnoreCase(other)
        System.out.println("Riya".equalsIgnoreCase("riya")); // Outputs: true

        // startsWith(prefix)
        System.out.println("Dinner".startsWith("Din")); // Outputs: true

        // toUpperCase() / toLowerCase()
        System.out.println("riya".toUpperCase()); // Outputs: RIYA
        System.out.println("RIYA".toLowerCase()); // Outputs: riya

        // substring(begin, end)
        System.out.println("Hello".substring(0, 2)); // Outputs: He

        // indexOf(sub)
        System.out.println("Hello".indexOf("l")); // Outputs: 2

        // charAt(i)
        System.out.println("Riya".charAt(0)); // Outputs: R
    }
}
