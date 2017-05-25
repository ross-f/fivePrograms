package uk.rossf.averageScores;

import uk.rossf.InputHelper;

import java.util.*;

/** * Spec - Program 1
 * Design and implement a program that will enable a class of 20 scores to be entered in a series.
 * The highest, lowest and average number will be found and displayed.
 *
 * let scores = [20 size list]
 *
 * for score in scores
 *      input score
 * done
 *
 * sort the scores
 *
 * let lowest = first score
 *
 * let highest = last score
 *
 * let total = 0
 *
 * for score in scores
 *      total += score
 * done
 *
 * let average = total / 20
 *
 * output lowest, highest, average
 */
public class AverageScores {

    public static void main(String[] args) {
        // Change the top number here
        final int NUMBER_OF_SCORES = 20;
        ArrayList<Integer> scores = new ArrayList<>(NUMBER_OF_SCORES);

        System.out.printf("Enter %d numbers\n", NUMBER_OF_SCORES);

        // loop to ask the user to enter the scores
        for (int i = 0; i < NUMBER_OF_SCORES; i++) {
            System.out.printf("Please enter score number %d: ", i + 1);

            // add the score to the list
            scores.add(InputHelper.getIntInput());
        }

        // Sorts the integers from lowest to highest
        Collections.sort(scores);

        // gets the first value in the sorted array
        final int lowest = scores.get(0);

        // gets the last value in the sorted array
        final int highest = scores.get(NUMBER_OF_SCORES - 1);

        // adds all the values together by converting the array to a stream and calling .sum()
        final int total = scores.stream().mapToInt(Integer::intValue).sum();

        // mean is calculated by dividing the total by the number entered
        final double average = total / NUMBER_OF_SCORES;

        System.out.printf("Highest is %d \n" +
                "Lowest is %d \n" +
                "Average is %.2f \n", highest, lowest, average);
    }
}
