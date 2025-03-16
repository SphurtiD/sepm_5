import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello, World!");

        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to Java.");
        
        // Close the scanner
        scanner.close();
    }
}