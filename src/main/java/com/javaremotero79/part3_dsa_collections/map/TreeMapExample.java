package com.javaremotero79.part3_dsa_collections.map;

import com.javaremotero79.part3_dsa_collections.map.book.Book;
import com.javaremotero79.part3_dsa_collections.map.book.BookComparable;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        //Exemplu cu Comparable
        SortedMap<BookComparable, String> booksByYear = new TreeMap<>();
        booksByYear.put(new BookComparable("1984", "Orwell",1949),"Distopic");
        booksByYear.put(new BookComparable("Brave New World", "Huxley",1932),"SF");
        booksByYear.put(new BookComparable("Sapiens", "Harari",2011),"Istoric");

        for (Map.Entry<BookComparable, String> it: booksByYear.entrySet()) {
            System.out.println(it.getKey() + " -> " + it.getValue());
        }
        System.out.println("------------------------");

        Comparator<Book> comparatorByTitle = (currentBook, otherBook) -> currentBook.getTitle().compareTo(otherBook.getTitle());
        Comparator<Book> comparatorByTitle2 = Comparator.comparing(Book::getTitle);
        //cele 2 comparatoare sunt identice
        //atata timp cat expresia lambda este o expresie care face comparatie doar la nivelul unei singure metode,
        //impunand ordinea crescatoare, putem REDUCE toata expresia la apelarea referentiala la nivel de clasa
        //insa daca schimbam ci cel mai mic lucru, precum ordinea, sa fie descrescatoare trebuie automat sa scriem expresia lambda
        Comparator<Book> comparatorByTitle3 = (currentBook, otherBook) -> currentBook.getTitle().compareTo(otherBook.getTitle());
        Comparator<Book> comparatorByTitle4 = Comparator
                .comparing(Book::getTitle)
                .thenComparing((currentBook,otherBook) -> otherBook.getAutor().compareTo(currentBook.getAutor()))
                .reversed();

        TreeMap<Book, String> booksByTitle = new TreeMap<>(comparatorByTitle4);
        booksByYear.put(new BookComparable("1984", "Orwell",1949),"Distopic");
        booksByYear.put(new BookComparable("Brave New World", "Huxley",1932),"SF");
        booksByYear.put(new BookComparable("Sapiens", "Harari",2011),"Istoric");

        for (Map.Entry<BookComparable, String> it: booksByYear.entrySet()) {
            System.out.println(it.getKey() + " -> " + it.getValue());
        }
        System.out.println("-----------------------------");

        Comparator<BookComparable> comparatorByAuthor = (BookComparable b1, BookComparable b2) -> b2.getAutor().compareTo(b1.getAutor());
        SortedMap<BookComparable, String> booksByAuthor = new TreeMap<>(comparatorByAuthor);
        booksByAuthor.put(new BookComparable("1984", "Orwell",1949),"Distopic");
        booksByAuthor.put(new BookComparable("Brave New World", "Huxley",1932),"SF");
        booksByAuthor.put(new BookComparable("Sapiens", "Harari",2011),"Istoric");

        for (Map.Entry<BookComparable, String> it: booksByAuthor.entrySet()) {
            System.out.println(it.getKey() + " -> " + it.getValue());
        }

    }
}
