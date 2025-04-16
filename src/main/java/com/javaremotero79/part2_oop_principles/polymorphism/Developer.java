package com.javaremotero79.part2_oop_principles.polymorphism;

/*
    Definitie: Polimorfismul permite apelarea aceleiasi metode pe
    obiecte de tipuri de date diferite, comportamentul fiind
    specific fiecarui obiect.

    Se poate manifesta in 2 moduri:
    - polimorfism static - compile time - prin supraincarcarea unui set de metode
        -- se intampla DOAR la nivelul clasei in care exista un set de metode
        -- se pastreaza denumirea metodei, dar se poate schimba atat semnatura, cat si
        implementarea
    - polimorfism dinamic - runtime - prin suprascrierea metodelor
        -- se intampla exclusiv in momentul unei relatii de mostenire intre clase,
        astfel incat clasa copil poate suprascrie metodele din clasa parinte
        -- se pastreaza semnatura metodei, dar se schimba corpul de implementare (optional)
 */

public class Developer {

//    Polimorfism dinamic - suprascriere in baza mostenirii
    public void work() {
        System.out.println("Developer works");
    }

//    polimorfism static - supraincarcare in baza redefinirii
//    metodelor in functie de inputul returnat/trimis
//    merge si pe metode void unde schimbati corpul de implementare sa/si
//    argumentele pasate.
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
    public long add(long a, long b) {
        return a + b;
    }
}
