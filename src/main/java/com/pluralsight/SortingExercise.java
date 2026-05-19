package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ============================================================
 *  SORTING EXERCISE — Comparators & Comparable in Java
 * ============================================================
 *
 *  OBJECTIVE:
 *  Practice sorting a List of objects using different field
 *  types: String, int, double, and boolean.
 *
 *  HOW TO COMPLETE THIS EXERCISE:
 *  Each TODO section asks you to write a sort.
 *  Use Collections.sort() or List.sort() with a Comparator.
 *
 *  HELPFUL METHODS:
 *  - String:  String.compareTo(), Comparator.comparing()
 *  - int:     Integer.compare()
 *  - double:  Double.compare()
 *  - boolean: Boolean.compare()
 *
 *  Run main() after each TODO to verify your sort with the
 *  printed output.
 * ============================================================
 */
public class SortingExercise {

    // ----------------------------------------------------------
    //  THE Book CLASS — do not modify this class
    // ----------------------------------------------------------
    static class Book {
        String  title;        // String
        String  author;       // String
        int     year;         // int    (publication year)
        double  rating;       // double (0.0 – 5.0)
        boolean inStock;      // boolean

        Book(String title, String author, int year,
             double rating, boolean inStock) {
            this.title   = title;
            this.author  = author;
            this.year    = year;
            this.rating  = rating;
            this.inStock = inStock;
        }

        @Override
        public String toString() {
            return String.format(
                    "%-40s | %-20s | %d | %.1f | %s",
                    title, author, year, rating,
                    inStock ? "In Stock" : "Out of Stock"
            );
        }
    }

    // ----------------------------------------------------------
    //  HELPER — prints a labeled list of books
    // ----------------------------------------------------------
    static void printBooks(String label, List<Book> books) {
        System.out.println("\n=== " + label + " ===");
        System.out.printf("%-40s | %-20s | %-4s | %-6s | %s%n",
                "Title", "Author", "Year", "Rating", "Stock");
        System.out.println("-".repeat(85));
        for (Book b : books) {
            System.out.println(b);
        }
    }

    // ----------------------------------------------------------
    //  STARTER DATA — 10 Book objects (do not modify)
    // ----------------------------------------------------------
    static List<Book> buildBookList() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby",                   "F. Scott Fitzgerald", 1925, 4.1, true));
        books.add(new Book("A Brief History of Time",            "Stephen Hawking",     1988, 4.7, false));
        books.add(new Book("Gone Girl",                          "Gillian Flynn",       2012, 3.9, true));
        books.add(new Book("Sapiens",                            "Yuval Noah Harari",   2011, 4.4, true));
        books.add(new Book("Dune",                               "Frank Herbert",       1965, 4.8, false));
        books.add(new Book("The Silent Patient",                 "Alex Michaelides",    2019, 4.2, true));
        books.add(new Book("Becoming",                           "Michelle Obama",      2018, 4.6, true));
        books.add(new Book("1984",                               "George Orwell",       1949, 4.5, true));
        books.add(new Book("The Girl with the Dragon Tattoo",    "Stieg Larsson",       2005, 4.1, false));
        books.add(new Book("Astrophysics for People in a Hurry", "Neil deGrasse Tyson", 2017, 4.2, true));
        return books;
    }

    // ==========================================================
    //  MAIN — work through each TODO in order
    // ==========================================================
    public static void main(String[] args) {

        List<Book> books = buildBookList();
        printBooks("UNSORTED (original order)", books);

        // -------------------------------------------------------
        // TODO 1 — Sort by TITLE (String) — A → Z
        //
        // Hint: Strings have a natural ordering via compareTo().
        //       Try: books.sort(Comparator.comparing(b -> b.title));
        //       Or use a lambda: (a, b) -> a.title.compareTo(b.title)
        // -------------------------------------------------------

//        books.sort(Comparator.comparing(book -> book.title));
        List<Book> booksSortedByTitle = books.stream().sorted(Comparator.comparing(book -> book.title)).toList();



        printBooks("TODO 1 — Sorted by Title (A → Z)", booksSortedByTitle);

        // -------------------------------------------------------
        // TODO 2 — Sort by TITLE (String) — Z → A (reversed)
        //
        // Hint: Use Comparator.reversed() or flip the compareTo.
        // -------------------------------------------------------

        // YOUR CODE HERE


        printBooks("TODO 2 — Sorted by Title (Z → A)", books);

        // -------------------------------------------------------
        // TODO 3 — Sort by AUTHOR last name (String)
        //
        // Hint: Each author string is "First Last".
        //       Use String.split(" ") to get the last name, then
        //       compare: split(" ")[1].compareTo(...)
        // -------------------------------------------------------

        // YOUR CODE HERE


        printBooks("TODO 3 — Sorted by Author Last Name (A → Z)", books);

        // -------------------------------------------------------
        // TODO 4 — Sort by YEAR (int) — oldest first
        //
        // Hint: Use Integer.compare(a.year, b.year)
        // -------------------------------------------------------

        // YOUR CODE HERE


        printBooks("TODO 4 — Sorted by Year (oldest first)", books);

        // -------------------------------------------------------
        // TODO 5 — Sort by YEAR (int) — newest first
        //
        // Hint: Just reverse the comparison from TODO 4.
        // -------------------------------------------------------

        // YOUR CODE HERE


        printBooks("TODO 5 — Sorted by Year (newest first)", books);

        // -------------------------------------------------------
        // TODO 6 — Sort by RATING (double) — highest first
        //
        // Hint: Use Double.compare(a.rating, b.rating) and reverse.
        // -------------------------------------------------------

        // YOUR CODE HERE


        printBooks("TODO 6 — Sorted by Rating (highest first)", books);

        // -------------------------------------------------------
        // TODO 7 — Sort by IN STOCK (boolean) — in-stock first
        //
        // Hint: true should come before false.
        //       Boolean.compare(true, false) returns a positive int.
        //       You may need to negate or reverse to get the right order.
        // -------------------------------------------------------

        // YOUR CODE HERE


        printBooks("TODO 7 — Sorted by In Stock (in-stock first)", books);

        // -------------------------------------------------------
        // TODO 8 — CHALLENGE: Sort in-stock books by rating (desc),
        //           then out-of-stock books by title (asc),
        //           keeping in-stock books at the top.
        //
        // Hint: Start with a boolean sort (in-stock first),
        //       then thenComparing() with a conditional or
        //       separate comparators.
        // -------------------------------------------------------

        // YOUR CODE HERE


        printBooks("TODO 8 — CHALLENGE: In-stock by Rating ↓, then Out-of-stock by Title ↑", books);
    }
}
