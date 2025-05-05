package com.javaremotero79.part3_dsa_collections.map;

/*
    INTRO MAP:

    Map<K,V> = Este o structura de date care stochaza o multime de elemente caracterizate sub
    forma unor perechi.
    Perechi: sunt compuse din cheie si valoare si respecta urmatoarele caracteristici:
      -cheia est eunica pe vaza hascode-ului
      -fiecare cheie MAPEAZA o singura valoare
      -valoarea poate la orice forma fara nicio restictie

    Map este o interfata similara Set-ului care stabileste un contract al metodelor CRUD.
    Ca si implementari discutam dspre HasMap, TreeMap si EnumMap.
 */
/*
HasMap:
  -nu impune nici un fel de ordonare a perechilor
  -permite stocarea unei singure perechi cu ceie si valoare nula
    -- putem avea O SINGRA CHEIE NULA, astfel incat sa respectam rincipiul unicitatii
    -- putem avea care valori nule vrem, atata timp  cat cheia e nenula, sau cat exista o singura cheie nula
  -compelxitatea la GET/PUT/REMOVE este 0(1) -> e o complexitate caracteristica operatiilor de asignare.
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> capitaleSiTari = new HashMap<>();
        capitaleSiTari.put("Romania", "Bucuresti");
        capitaleSiTari.put("Franta", "Paris");
        capitaleSiTari.put("Italia", "Roma");
        System.out.println(capitaleSiTari);
        System.out.println("-----------");

        capitaleSiTari.putAll(Map.of(
                "Germania", "Berlin",
                "Spania", "Madrid"
        ));
        System.out.println(capitaleSiTari);
        System.out.println("-----------");

        capitaleSiTari.putIfAbsent("UK", "Londra");
        capitaleSiTari.putIfAbsent("Romania", "Cluj");
        // putIfAbsent, intai face o verificare de continut asupra hascode-ului cheii:
        //-daca containsKey intoarce true, nu se adauga map
        //-daca containsKey intoarce false, se adauga in map prin crearea unui nou spatiu de memorie
        System.out.println(capitaleSiTari);
        System.out.println("-----------");

        capitaleSiTari.put("Romania", "Cluj");
        // put, intai face o verificare de continut asupra hascode-ului cheii:
        //-daca containsKey intoarce true, se actualizeaza perechea cu noua valoare
        //-daca containsKey intoarce false, se adauga in Map prin crearea unui nou spatiu de memorie
        System.out.println(capitaleSiTari);
        System.out.println("-----------");

        System.out.println(capitaleSiTari.get("Romania"));
        System.out.println(capitaleSiTari.get("Norvegia"));
        System.out.println(capitaleSiTari.getOrDefault("Norvegia", "Nu se gaseste in map! Incercati cu alta tara"));
        System.out.println(capitaleSiTari.getOrDefault("Italia", "Nu se gaseste in map! Incercati cu alta tara"));
        System.out.println("-----------");

        System.out.println(capitaleSiTari.remove("Spania"));
        System.out.println(capitaleSiTari.remove("Norvegia"));
        System.out.println(capitaleSiTari);
        System.out.println("-----------");

        System.out.println(capitaleSiTari.remove("Franta", "Paris"));
        System.out.println(capitaleSiTari.remove("Franta", "Sorbona"));
        System.out.println(capitaleSiTari.remove("Franta", "Oslo"));
        System.out.println(capitaleSiTari);
        System.out.println("-----------");


        // Iteratie la nivel de pereche
        for (Map.Entry<String,String> it: capitaleSiTari.entrySet()) {
            System.out.println(it.getKey()+ " -> " + it.getValue());
        }
        System.out.println("-----------");

        //Iteratie la nivel de chei
        for (String it: capitaleSiTari.keySet()){
            System.out.println(it + " ");
        }
        System.out.println("-----------");

        //Iteratie la nivel de valori
        for (String it: capitaleSiTari.values()){
            System.out.println(it + " ");
        }
        System.out.println("-----------=");
    }
}
