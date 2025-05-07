package com.javaremotero79.part4_generic.generic_interface.functionl_interface.build_in;

/*
  Predicate = e o I.F. care intoarce un rezultat boolean si primeste un argument generic
 - este singura I.F. care intoarce boolean, automat scopul principal este
 stocarea si rezolvarea metodelor conditionale*/

import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        //todo: incorporati algoritmul de verificare si afisare a numerelor pozitive dintr o lista intr un Consumer
        List<Integer> numbers = List.of(-1,2,3,1,-2,-123,54,2,1,4);
        Predicate<Integer> isPositive = nr -> nr > 0;
        for (Integer it: numbers) {
            if (isPositive.test(it)) {
                System.out.print(it + " ");
            }
        }

    }
}
