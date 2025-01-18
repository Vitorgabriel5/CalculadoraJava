package calculation.scientific;

import java.util.Scanner;

public class ScientificCalculatorHandler {

    // Method to execute scientific calculator operations.
    public void executeScientificCalculator(Scanner sc) {
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        // Prompt the user to choose the type of operation.
        System.out.println("Choose the type of operation:");
        System.out.println("1- Addition 2- Subtraction 3- Multiplication 4- Division");
        System.out.println("5- Square Root 6- Power 7- Sine 8- Cosine");
        int operation = sc.nextInt();

        double result = 0;

        // Perform the chosen operation based on the user's input.
        switch (operation) {
            case 1:
            case 2:
            case 3:
            case 4:
                result = executeBasicOperation(sc, scientificCalculator, operation);
                break;
            case 5:
                System.out.print("Enter the number for the operation: ");
                double a = sc.nextDouble();
                result = scientificCalculator.calculateSquareRoot(a);
                break;
            case 6:
                System.out.print("Enter the base: ");
                double base = sc.nextDouble();
                System.out.print("Enter the exponent: ");
                double exponent = sc.nextDouble();
                result = scientificCalculator.calculatePower(base, exponent);
                break;
            case 7:
                System.out.print("Enter the angle in degrees: ");
                double degrees = sc.nextDouble();
                result = scientificCalculator.calculateSine(degrees);
                break;
            case 8:
                System.out.print("Enter the angle in degrees: ");
                double cosineDegrees = sc.nextDouble();
                result = scientificCalculator.calculateCosine(cosineDegrees);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        // Display the result of the operation.
        System.out.println("Result: " + result);
    }

    // Private method to execute basic operations (addition, subtraction, multiplication, division).
    private double executeBasicOperation(Scanner sc, ScientificCalculator calc, int operation) {
        System.out.println("Enter the first number:");
        double a = sc.nextDouble();
        System.out.println("Enter the second number:");
        double b = sc.nextDouble();

        switch (operation) {
            case 1:
                return calc.add(a, b);
            case 2:
                return calc.subtract(a, b);
            case 3:
                return calc.multiply(a, b);
            case 4:
                return calc.divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
