import java.util.Scanner;

public class ConsoleCalculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Java Console Calculator");

        while (running) {
            System.out.println("\nSelect an operation (+, -, *, /) or type 'exit' to quit:");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                running = false;
                System.out.println("Exiting calculator. Goodbye.");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            switch (operation) {
                case "+":
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case "-":
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case "*":
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case "/":
                    double result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please enter +, -, *, / or 'exit'.");
            }
        }

        scanner.close();
    }
}
