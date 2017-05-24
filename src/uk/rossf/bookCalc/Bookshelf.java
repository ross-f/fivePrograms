package uk.rossf.bookCalc;

import java.util.ArrayList;

public class Bookshelf {
    private ArrayList<Book> books;

    public Bookshelf() {
        books = new ArrayList<>();

        boolean moreBooks = true;

        while (moreBooks) {
            books.add(new Book());

            System.out.printf("You have entered %d books, would you like to enter more (y/n)", books.size());

            moreBooks = InputHelper.getBooleanInput();
        }
    }
}
