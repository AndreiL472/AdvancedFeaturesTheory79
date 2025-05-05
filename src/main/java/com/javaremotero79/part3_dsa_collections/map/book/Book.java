package com.javaremotero79.part3_dsa_collections.map.book;

public class Book {

    private  String title;
    private  String autor;
    int an;

    public Book(String title, String autor, int an) {
        this.title = title;
        this.autor = autor;
        this.an = an;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", an=" + an +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public int getAn() {
        return an;
    }
}
