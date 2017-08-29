package com.seed.library.utility;

import com.seed.library.Book;

import java.util.ArrayList;
import java.util.Collections;

public class SortUtil {
    public static ArrayList<Book> sortByName(ArrayList<Book> b1) {
        Collections.sort(b1, new CompareBookByName());

        return b1;
    }

    public static ArrayList<Book> sortByPrice(ArrayList<Book> b1) {
        Collections.sort(b1, new CompareBookByPrice());

        return b1;
    }
}
