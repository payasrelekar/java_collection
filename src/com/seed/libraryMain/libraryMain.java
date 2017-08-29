package com.seed.libraryMain;

import com.seed.library.Book;
import com.seed.library.utility.*;

import java.util.*;

public class libraryMain {

    public static void main(String args[]) {
        //Create new Book Set
        StoreUtil<Book> shelf = new StoreUtil<>();

        //Add up to 10 randomly generated Books to shelf
        for(int i=0; i<genRandomNo(10)+1; i++) {
            shelf.addRecords(new Book(genRandomNo(100),
                    genName(), genAuthList(), genRandomNo(1000)));
        }

        //Print No of Books in shelf
        System.out.println("No of Books on Shelf = "+shelf.getNoOfRecords());

        //Print Unsorted Book list
        System.out.print("\n");
        System.out.println("****Unsorted Shelf****");
        //Print Book list through a new object of PrintRecords
        new PrintUtil().printRecords(shelf.getRecords());
        System.out.print("\n");

        //Create a temp book list
        List<Book> temp = new ArrayList<>(shelf.getRecords());

        //Sort books by Name
        Collections.sort(temp, new CompareBookByName());
        //Print books Sorted By Name
        System.out.println("****Sorted By NAME****");
        //Print through new object of PrintRecords
        new PrintUtil().printRecords(temp);
        System.out.print("\n");

        //Sort books by Price
        Collections.sort(temp, new CompareBookByPrice());
        //Print books Sorted By Price
        System.out.println("****Sorted By PRICE****");
        //Print through new object of PrintRecords
        new PrintUtil().printRecords(temp);
        System.out.print("\n");
    }

    //Generate a random character sequence up to 8 letters
    public static String genName() {
        StringBuffer name = new StringBuffer();

        //Insert a Random capital Letter first
        name.append((char)(genRandomNo(25)+'A'));
        //Randomize length up to 6 characters
        for(int i=0; i<genRandomNo(7)+1;i++) {
            //Add next characters in small letters
            name.append((char)(genRandomNo(25)+'a'));
        }
        //Convert to String and return
        return name.toString();
    }

    //Generate a list of random Author names up to 4 authors
    public static Set<String> genAuthList() {
        Set<String> authors = new TreeSet<>();

        //Randomize author list length up to 4 authors
        for (int i=0; i<genRandomNo(4)+1; i++) {
            authors.add(genName());
        }
        return authors;
    }

    //Generate random number up to max
    public static int genRandomNo(int max) {
        return (int)(Math.random()*max);
    }
}
