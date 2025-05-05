package com.javaremotero79.part3_dsa_collections.set.set2;

public class CarComparable implements Comparable<CarComparable> {
    private String culoare;
    private String marca;
    private int nrLocuri;

    public CarComparable(String culoare, String marca, int nrLocuri) {
        this.culoare = culoare;
        this.marca = marca;
        this.nrLocuri = nrLocuri;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getMarca() {
        return marca;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public String toString() {
        return "CarComparabil{" +
                "culoare='" + culoare + '\'' +
                ", marca='" + marca + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    /*
        Set<CarComparable> carComparableSet = new TreeSet<>();
        carComparableSet = {}

        carComparableSet.add(new CarComparable("Gri", "Peugeot", 5));
            currentObj = new CarComparable("Gri", "Peugeot", 5)
                -> se creeaza hashcode-ul obiectului
                -> se verifica existenta lui => carComparableSet.contains(currentObj) ??
                -> incepe procesul de comparatie
                -> se intra cu metoda compareTo in set parcurgand toate elementele existente
                -> currentObj.compareTo(otherObj)
        carComparableSet.add(new CarComparable("Rosu", "Seat", 5));
        carComparableSet.add(new CarComparable("Rosu", "Bmw", 5));
        carComparableSet.add(new CarComparable("Negru", "Masserati", 3));
     */

    @Override
    public int compareTo(CarComparable otherObj) {
        // this -> currentObj, otherObj
        int result = Integer.compare(this.nrLocuri, otherObj.nrLocuri);
        // ordine crescatoare inseamna sa compari this cu other
        // ordine descrescatoare inseamna sa compari other cu this

        // orice alta regula de sortare trebuie sa se intample DOAR daca
        // regulile anterioare nu au putut seta o ordine si au produs result = 0

        if(result == 0) {
            result = otherObj.marca.compareTo(this.marca);
        }

        if(result == 0) {
            result = this.culoare.compareTo(otherObj.culoare);
        }

        return result;
    }
}