package calculation.simple;

import java.util.Scanner;

public class SimpleCalculatorHandler {

    // Method to execute the simple calculator operations.
    public void executeSimpleCalculator(Scanner sc) {
        SimpleCalculator simpleCalc = new SimpleCalculator();

        // Prompt the user to choose the type of operation.
        System.out.println("Choose the type of operation: 1- Addition 2- Subtraction 3- Multiplication 4- Division");
        int operation = sc.nextInt();

        // Ask the user for the two numbers for the operation.
        System.out.println("Enter the first number:");
        double a = sc.nextDouble();
        System.out.println("Enter the second number:");
        double b = sc.nextDouble();

        double result = 0;

        // Perform the chosen operation using a switch statement.
        switch (operation) {
            case 1:
                result = simpleCalc.add(a, b);
                break;
            case 2:
                result = simpleCalc.subtract(a, b);
                break;
            case 3:
                result = simpleCalc.multiply(a, b);
                break;
            case 4:
                result = simpleCalc.divide(a, b);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        // Display the result of the operation.
        System.out.println("Result: " + result);
    }
}
