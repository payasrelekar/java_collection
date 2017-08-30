package com.seed.library.utility;

import com.seed.library.Book;

import java.util.ArrayList;

public class SortUtil {
    public static ArrayList<Book> sortByName(ArrayList<Book> b1) {
        b1.sort(new CompareBookByName());

        return b1;
    }

    public static ArrayList<Book> sortByPrice(ArrayList<Book> b1) {
        b1.sort(new CompareBookByPrice());

        return b1;
    }
}
