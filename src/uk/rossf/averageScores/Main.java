package uk.rossf.averageScores;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        final int NUMBER_OF_SCORES = 20;
        ArrayList<Double> scores = new ArrayList<>(NUMBER_OF_SCORES);

        System.out.printf("Enter %d numbers\n", NUMBER_OF_SCORES);

        // loop to ask the user to enter the scores
        for (int i = 0; i < NUMBER_OF_SCORES; i++) {
            System.out.printf("Please enter score number %d: ", i + 1);

            // add the score to the list
            scores.add(intInputHelper());
        }

        // Sorts the integers from lowest to highest
        Collections.sort(scores);

        // gets the first values in the sorted array
        final double lowest = scores.get(0);

        // gets the last values in the sorted array
        final double highest = scores.get(NUMBER_OF_SCORES - 1);

        // adds all the values together by converting the array to a stream and calling .sum()
        final double total = scores.stream().mapToDouble(Double::doubleValue).sum();

        // mean is calculated by dividing the total by the number entered
        final double average = total / NUMBER_OF_SCORES;

        System.out.printf("Highest is %f2 \n" +
                "Lowest is %f2 \n" +
                "Average is %f2 \n", highest, lowest, average);
    }

    /**
     * Manages getting a integer input from the user
     * Handel exceptions by asking for input again
     * @return input The entered integer
     */
    private static Double intInputHelper() {
        // initialise input
        double input = -1;

        do {
            Scanner scanner = new Scanner(System.in);

            try {
                input = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("That's not a valid input \nPlease enter a number: ");
            }
        } while (input==-1);

        return input;
    }
}
