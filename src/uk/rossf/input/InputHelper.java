package uk.rossf.input;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class InputHelper {
    static Scanner scanner = new Scanner(System.in);

    static int getIntInput() {
        int input = -1;

        do {
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number.");
            }
        } while (input == -1);

        return input;
    }

    static String getStringInput() {
        String input = "";

        do {
            scanner.nextLine();
        } while (input.length() == 0);

        return input;
    }

    static Boolean getBooleanInput() {
        String initialInput = InputHelper.getStringInput();

        String[] trueChoices = { "y", "Y", "yes", "Yes", "ye", "sure" };

        for (String trueChoice : trueChoices) {
            if (Objects.equals(initialInput, trueChoice)) return true;
        }

        return false;
    }
}
