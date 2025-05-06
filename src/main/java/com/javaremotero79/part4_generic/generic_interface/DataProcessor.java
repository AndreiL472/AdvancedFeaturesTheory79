package com.javaremotero79.part4_generic.generic_interface;
/*
* NU POT FOLOSI INSTRUCTIUNEA LAMBDA PT CA AVEM MAI MULT DE O METODA ABSTRACTA
* ofera suport pt abstractii mult mai complexe
* putem avea mai multe metode abstracte
* */


public interface DataProcessor<T> {

    void process(T item);
    boolean validate(T item);
    String serialize(T item);

}
