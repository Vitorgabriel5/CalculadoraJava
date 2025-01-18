package calculation.simple;

public class SimpleCalculator {

    // Method to perform addition.
    public double add(double a, double b) {
        return a + b;
    }

    // Method to perform subtraction.
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to perform multiplication.
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to perform division.
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }
}
