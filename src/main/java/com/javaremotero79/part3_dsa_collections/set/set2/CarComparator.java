package com.javaremotero79.part3_dsa_collections.set.set2;

public class CarComparator {
    private String culoare;
    private String marca;
    private int nrLocuri;

    public CarComparator(String culoare, String marca, int nrLocuri) {
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
}