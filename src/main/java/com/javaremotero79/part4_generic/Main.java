package com.javaremotero79.part4_generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //Initializare si definire a unei obiect de tipul unei clase concrete
        Object tmp = new Object();

        //Initializarea si definire a unui obiect de tipul unei interfete generice
        List<String> strings = new ArrayList<>();

        //Initializarea si definire a unui obiect de tipul unei clase generice
        Box<Integer> intBox = new Box<>(42,"numarul 42");
        Box<String> stringBox = new Box<>("Hi!", "World!");
        Box<List<String>> listStringBox = new Box<>(
                List.of("alune", "seminte"),
                "Lista de cumparaturi"
        );
        System.out.println(intBox.getValue());
        System.out.println(stringBox.getValue());
        System.out.println(listStringBox.getValue());

        //Obiect de tipul unuei clase generice cu parametri multipli
        Triplet<Box<String>, Integer, Map<String, Double>> triplet = new Triplet<>(
                new Box<>("text1", "text2"),
                        56,
                        Map.of(
                                "ket text", 45.2,
                                "key2", 667.2)
                );
        System.out.println(triplet);
    }
}
