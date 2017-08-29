package com.seed.library.utility;

import com.seed.library.Book;

import java.util.List;

public class PrintUtil {
    public void printRecords(List<Book> records) {
        for(Book i:records) {
            System.out.println(i);
        }
    }
}
