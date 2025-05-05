package com.javaremotero79.part3_dsa_collections.set.set2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetExample2 {

    public static void main(String[] args) {
        /* Example with Comparable interface */
        Set<CarComparable> carComparableSet = new TreeSet<>();

        carComparableSet.add(new CarComparable("Gri", "Peugeot", 5));
        carComparableSet.add(new CarComparable("Rosu", "Seat", 5));
        carComparableSet.add(new CarComparable("Rosu", "Bmw", 5));
        carComparableSet.add(new CarComparable("Negru", "Masserati", 3));
        carComparableSet.add(new CarComparable("Roz", "Masserati", 3));
        carComparableSet.add(new CarComparable("Roz", "Masserati", 3)); // => duplicitar ptc toate atributele din comparator sunt egale

        for (CarComparable it : carComparableSet) {
            System .out.println(it.getMarca() + " " + it.getNrLocuri() + " " + it.getCuloare());
        }
        System.out.println("-----------------------------");

        /* Example with Comparator interface */

        // CarComparator::getNrLocuri) = expresie lambda referentiala
        // inseamna ca se scrie o instructiune lambda care compara 2 elemente din set dupa metoda getter getNrLocuri
        // (it1, it2) -> Integer.compare(it1,it2);
        // se poate folosi DOAR la sortarea prin ordine crescatoare dupa getter-ul ales
        // iar pt orice alt tip de ordine, e nevoie sa definiti o expresie lambda
        Comparator<CarComparator> carComparator = Comparator
                .comparingInt(CarComparator::getNrLocuri)
                .thenComparing(CarComparator::getCuloare)
                .thenComparing(
                        (currentObj, otherObj) -> otherObj.getMarca().compareTo(currentObj.getMarca())
                );

        // todo: verificat dc comparing/comparingInt nu accepta lambda cu 2 parametri
        // todo: sau dc thenComparing nu poate fi prima instructiune de comparatie
        Comparator<CarComparator> carComparator2 = Comparator
                .comparing(CarComparator::getCuloare)
                .thenComparing(CarComparator::getNrLocuri)
                .thenComparing(
                        (currentObj, otherObj) -> otherObj.getMarca().compareTo(currentObj.getMarca())
                );

        Set<CarComparator> carComparatorSet = new TreeSet<>(carComparator);

        carComparatorSet.add(new CarComparator("Gri", "Peugeot", 5));
        carComparatorSet.add(new CarComparator("Rosu", "Seat", 5));
        carComparatorSet.add(new CarComparator("Rosu", "Bmw", 5));
        carComparatorSet.add(new CarComparator("Negru", "Masserati", 3));
        carComparatorSet.add(new CarComparator("Roz", "Masserati", 3));
        carComparatorSet.add(new CarComparator("Roz", "Masserati", 3)); // => duplicitar ptc toate atributele din comparator sunt egale

        for (CarComparator it : carComparatorSet) {
            System.out.println(it.getMarca() + " " + it.getNrLocuri() + " " + it.getCuloare());
        }
    }
}