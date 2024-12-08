import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConverting = true;

        while (continueConverting) {
            System.out.println("Temperature Converter");
            System.out.println("------------------------");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.print("Choose an option (1 or 2): ");

            int option = 0;
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next(); // Clear the invalid input
                continue;
            }

            System.out.print("Enter temperature value: ");
            double temperature = 0;
            try {
                temperature = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric temperature value.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            double convertedTemperature = 0;

            if (option == 1) {
                // Celsius to Fahrenheit
                convertedTemperature = (temperature * 9 / 5) + 32;
                System.out.printf("%.2f°C is equal to %.2f°F%n", temperature, convertedTemperature);
            } else if (option == 2) {
                // Fahrenheit to Celsius
                convertedTemperature = (temperature - 32) * 5 / 9;
                System.out.printf("%.2f°F is equal to %.2f°C%n", temperature, convertedTemperature);
            } else {
                System.out.println("Invalid option. Please choose a valid option.");
            }

            System.out.print("Do you want to convert another temperature? (yes/no): ");
            String response = scanner.next();
            continueConverting = response.equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}
