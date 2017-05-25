package uk.rossf.BookCalculator;

import uk.rossf.InputHelper;

/** Spec - Program 2
 * Calculate the number of uniformed size books that will fit in a library of uniform size bookcases.
 * The user is expected to enter the dimensions of the book and of the bookcase, and the number of bookcases.
 *
 * The output will be the number of books in the library.
 *

 * let bookSize = how wide is the book
 * let shelveSize = how wide is each shelve
 * let noShelves = how many shelves on the book case
 * let noOfBookCases = how many bookcases
 * output (bookSize/shelveSize) * noShelves * noOfBookCases
 */
public class BookCalculator {
    public static void main(String[] args) {

        System.out.println("How wide is each book in cm?");
        double bookSize = InputHelper.getDoubleInput();

        System.out.println("How wide is each shelf in cm?");
        double shelveSize = InputHelper.getDoubleInput();

        System.out.println("How many shelves are there on a bookcase?");
        double noShelves = InputHelper.getIntInput();

        System.out.println("How many bookcases do you have?");
        double noOfBookCases = InputHelper.getIntInput();

        int numberOfBooks = (int) Math.floor(shelveSize / bookSize * noShelves * noOfBookCases);

        System.out.printf("You can fit %d books in your library \n", numberOfBooks);
    }
}
