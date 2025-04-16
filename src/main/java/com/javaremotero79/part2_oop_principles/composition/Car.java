package com.javaremotero79.part2_oop_principles.composition;
/*
 Definitie: Compozitia presupune ca o clasa sa detina instante ale altor clase pt
 a si defini comportamentul

 Prin urmare, e o consecinta a incapsularii, si functioneaza dpdv structural invers
 fata de mostenire.

 Mostenirea porneste de la o clasa de vaza si defineste mai multe sub clase.
 Compozitia porneste de la mai multe sub clase si defineste o clasa de baza.

 O aplicatie directa a compozitiei sunt clasele finale.
 Clasele finale marcheaza o clasa ca fiind nemostenibila.
 */
public final class Car {

    private Engine engine;
    private String brand;
    private String serie;
    private String nrDeInmatriculare;

    public Car(Engine engine, String brand, String serie, String nrDeInmatriculare) {
        this.engine = engine;
        this.brand = brand;
        this.serie = serie;
        this.nrDeInmatriculare = nrDeInmatriculare;


    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", brand='" + brand + '\'' +
                ", serie='" + serie + '\'' +
                ", nrDeInmatriculare='" + nrDeInmatriculare + '\'' +
                '}';
    }
}
