import java.util.Scanner;

public class CommandLineUI {
    private Scanner scanner;

    public CommandLineUI() {
        this.scanner = new Scanner(System.in);
    }

    public void initialize() {
        while (true) {
            System.out.println("Command-Line User Interface");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Perform action for Option 1
                    System.out.println("You selected Option 1.");
                    break;
                case 2:
                    // Perform action for Option 2
                    System.out.println("You selected Option 2.");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return; // Return to exit the method
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-3).");
            }
        }
    }
}
