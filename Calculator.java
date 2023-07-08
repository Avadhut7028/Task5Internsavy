import java.util.Scanner;

interface Calculator {
    void add(int num1, int num2);

    void subtract(int num1, int num2);

    void multiply(int num1, int num2);

    void divide(int num1, int num2);
}

class BasicCalculator implements Calculator {
    @Override
    public void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Addition Result: " + result);
    }

    @Override
    public void subtract(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Subtraction Result: " + result);
    }

    @Override
    public void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Multiplication Result: " + result);
    }

    @Override
    public void divide(int num1, int num2) {
        if (num2 != 0) {
            double result = (double) num1 / num2;
            System.out.println("Division Result: " + result);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new BasicCalculator();

        System.out.println("Basic Calculator");
        System.out.println("----------------");

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculator.add(num1, num2);
                break;
            case 2:
                calculator.subtract(num1, num2);
                break;
            case 3:
                calculator.multiply(num1, num2);
                break;
            case 4:
                calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                break;
        }

        scanner.close();
    }
}
