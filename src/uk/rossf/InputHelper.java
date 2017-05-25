package uk.rossf;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class InputHelper {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Manages getting a integer input from the user
     * Handle exceptions by asking for input again
     * @return input The entered integer
     */
    public static int getIntInput() {
        int input = -1;

        do {
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a whole number.");

                scanner = new Scanner(System.in);
            }
        } while (input == -1);

        return input;
    }

    /**
     * Manages getting a double input from the user
     * Handle exceptions by asking for input again
     * @return input The entered integer
     */
    public static double getDoubleInput() {
        double input = -1;

        do {
            try {
                input = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number.");

                scanner = new Scanner(System.in);
            }
        } while (input == -1);

        return input;
    }

    /**
     * Manages getting a string input from the user
     * Handle exceptions by asking for input again
     * @return input The entered string
     */
    static String getStringInput() {
        String input = "";

        do {
            scanner.nextLine();
        } while (input.length() == 0);

        return input;
    }

    /**
     * Manages getting a bool input from the user
     * Handle exceptions by asking for input again
     * @return input The entered bool
     */
    public static Boolean getBooleanInput() {
        String initialInput = InputHelper.getStringInput();

        String[] trueChoices = { "y", "yes", "ye", "sure", "go for it", "why not", "might as well", "fine", "ya" };

        for (String trueChoice : trueChoices) {
            if (initialInput.equalsIgnoreCase(trueChoice)) return true;
        }

        return false;
    }
}
