package application;

import calculation.scientific.ScientificCalculatorHandler;
import calculation.simple.SimpleCalculatorHandler;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Prompt the user to choose the type of calculator.
        System.out.println("Choose the Calculator type:");
        System.out.println("1- Simple Calculator");
        System.out.println("2- Scientific Calculator");
        int calculatorType = sc.nextInt();

        if (calculatorType == 1) {
            // Instantiate and execute the Simple Calculator handler.
            SimpleCalculatorHandler simpleHandler = new SimpleCalculatorHandler();
            simpleHandler.executeSimpleCalculator(sc);
        } else if (calculatorType == 2) {
            // Instantiate and execute the Scientific Calculator handler.
            ScientificCalculatorHandler scientificHandler = new ScientificCalculatorHandler();
            scientificHandler.executeScientificCalculator(sc);
        } else {
            // Inform the user that the chosen option is invalid.
            System.out.println("Invalid option");
        }

        // Close the Scanner object.
        sc.close();
    }
}
