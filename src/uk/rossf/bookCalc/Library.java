package uk.rossf.bookCalc;

import java.util.ArrayList;

public class Library {
    private ArrayList<Bookshelf> bookshelves;

    public Library() {
        System.out.println("Please enter the number of bookshelves in the library");

        int numberOfBookShelves = InputHelper.getIntInput();

        bookshelves = new ArrayList<Bookshelf>(numberOfBookShelves);

        for (int i = 1; i <= numberOfBookShelves; i++) {
            System.out.printf("Please enter data for bookshelf number %d", i);

            bookshelves.add(new Bookshelf());
        }
    }
}
