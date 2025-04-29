package com.javaremotero79.part3_dsa_collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> users = new HashSet<>();

        users.add("Ana");
        users.add("are");
        users.add("mere");
        users.add(".");

        System.out.println(users);
        System.out.println("----------------------");

        users.add("mere"); //nu se arunca exceptii in situatia in care se introduc valori existente
        users.add(null);//poate exista in HasSet/LinkedHashSet, dar nu poate exista in TreeSet


        System.out.println(users);
        System.out.println("----------------------");

        Set<String> words = new HashSet<>();
        words.addAll(Set.of("Ion", "mancare", "Ana", "caine", "."));

        users.retainAll(words);//face intersectia valorilor comunte intre 2 structuri de date
        for (String it: users){
            System.out.println(it + " ");
        }

        System.out.print("----------------------");
        System.out.println();

        System.out.println(displayUniqueValues(List.of(1,2,2,3,4,4,2,1,3,4,4,4,1,21)));
        System.out.println(displayDuplicateValues(List.of(1,2,2,3,4,4,2,1,3,4,4,4,1,21)));
    }

    private static List<Integer> displayUniqueValues(List<Integer>numbers){
        List<Integer>duplicateExcessNumbers = new ArrayList<>();
        Set<Integer>uniqueNumbers = new HashSet<>();

        for (Integer it: numbers) {
            if (uniqueNumbers.contains(it)){
                duplicateExcessNumbers.add(it);
            } else {
                uniqueNumbers.add(it);
            }
        }
        return duplicateExcessNumbers;

    }


    private static Set<Integer> displayDuplicateValues(List<Integer>numbers) {
        Set<Integer> resultUniqueValues = new HashSet<>(numbers);
        return  resultUniqueValues;
        //return new HashSet<>(numbers);
    }

}
