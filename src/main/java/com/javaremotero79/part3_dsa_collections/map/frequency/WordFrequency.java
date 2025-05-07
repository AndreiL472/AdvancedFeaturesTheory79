package com.javaremotero79.part3_dsa_collections.map.frequency;

import java.util.*;

/*
Map<String, int> map = new HasMap<>();
-> arunca eroare de compilatie pt ca HasMap accepta doar clase de tipul Object sau descendenti ai acesteia
->Map este o interfata generica de tipul map<K, V> unde K,V sunt Objects

* Avem o lista de cuvinte, afisati frecventa aparitiei cuvintelor
* Input:
*
* List = {"apple", "banane", "apple", "orange", "banana", "apple" }
* SAU
* String= "aple banana apple orange banana apple"'
* List = String.split("")
* OutPut:
*
* apple -> 3
* bnanana ->2
* orange -> 1*/

public class WordFrequency {
    public static void main(String[] args) {

        //Metoda 1: Calculearea mapei de frecventa a aparitiilor cuvintelor in lista
        List<String> cuvinte = new ArrayList<>(List.of("apple", "banane", "apple", "orange", "banana", "apple"));
        Map<String,Integer> freqCuvinte = new HashMap<>();

        for (String it: cuvinte) {
            if (freqCuvinte.containsKey(it)) {
                //TRUE -> a fost identificata cheia in mapa, prin urmare se incrementeaza nr aparitiilor
                freqCuvinte.put(it, freqCuvinte.get(it) + 1);
            } else {
                //FALSE -> nu a fost identificata cheia in mapa, prin urmare se adauga o noua pereche cu valoarea 1
                freqCuvinte.put(it, 1);
            }

        }

        System.out.println(freqCuvinte + "\n----------------");

        //Metoda 2: idem cerinta, insa cu o singura linie de cod
        freqCuvinte.clear(); // va sterge toate perechile din mapa
        System.out.println("Mapa are dimensiunea: " + freqCuvinte.size());

        for (String it: cuvinte) {
            freqCuvinte.put(it, freqCuvinte.getOrDefault(it, 0) + 1);
        }

        System.out.println(freqCuvinte + "\n---------------------");

        // Metoda 1: Sortarea alfabetica/crescatoare/lexicografica a Mapei dupa cheia String
        // am comparator
        SortedMap<String, Integer> sortedFreqCuvinte = new TreeMap<>(freqCuvinte);
        // valabil si la nivel de set de clase simple: String, Integer, Floar, Double, Character, etc
        System.out.println(sortedFreqCuvinte+ "\n---------------");

        TreeMap<String, Integer> descendingFreqCuvinte = new TreeMap<>(
          Comparator
                  .comparing(String::length)
                  // sortez crescator dupa lungimea cuvantului
                  .reversed()
                  // inversez ordinea elementelor in mapa, astfel incat sa fie descrescator
                  .thenComparing(Comparator.naturalOrder())
                // daca lungimile a 2 cuvinte sunt egale, sortez in ordinea naturala
                // -> ordinea introducerii datelor in map
                // in situatia unei clase de obiect, putem avea pe thenComparing
                // o alta regula de sortare bazata pe alte atribute din clasa
        );
        descendingFreqCuvinte.putAll(freqCuvinte);
        System.out.println(descendingFreqCuvinte + "\n---------------------------");
    }
}
