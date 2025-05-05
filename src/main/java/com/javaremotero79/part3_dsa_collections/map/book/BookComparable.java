package com.javaremotero79.part3_dsa_collections.map.book;

public class BookComparable implements Comparable<BookComparable> {

    private  String title;
    private  String autor;
    private  int an;

    public BookComparable(String title, String autor, int an) {
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

    @Override
    public int compareTo(BookComparable other) {
   //     int result = Integer.compare(this.an,other.an);
        //crescator ptc la inseratie in mapa comparam elementul de inserare(curent)
        int result = Integer.compare(other.an,this.an);
        //descrescator ptc la inseratie in mapa comparam elementele de inserat (curent)

        //se pot adauga si alte verificari in cazul egalitatii regulii anterioare
        /*
        if(this.an == other.an) {
         //setati alte regula

         ...
        }*/

        return result;
    }
}
