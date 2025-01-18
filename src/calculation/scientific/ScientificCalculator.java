package calculation.scientific;

import calculation.simple.SimpleCalculator;

public class ScientificCalculator extends SimpleCalculator {

    // Method to calculate the square root of a number.
    public double calculateSquareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return Math.sqrt(a);
    }

    // Method to calculate the power of a number.
    public double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Method to calculate the sine of an angle (in degrees).
    public double calculateSine(double angleInDegrees) {
        return Math.sin(Math.toRadians(angleInDegrees));
    }

    // Method to calculate the cosine of an angle (in degrees).
    public double calculateCosine(double angleInDegrees) {
        return Math.cos(Math.toRadians(angleInDegrees));
    }
}
