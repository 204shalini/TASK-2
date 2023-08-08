import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter App!");
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();
            if (choice == 2) {
                System.out.println("Exiting the app. Goodbye!");
                break;
            }

            if (choice == 1) {
                System.out.println("Enter the temperature in Celsius:");
                double celsius = scanner.nextDouble();

                double fahrenheit = (celsius * 9 / 5) + 32;

                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}
