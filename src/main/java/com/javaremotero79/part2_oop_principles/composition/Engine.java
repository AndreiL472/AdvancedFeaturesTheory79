package com.javaremotero79.part2_oop_principles.composition;

public class Engine {

    private int dimensiune;
    private String tip;

    public Engine(int dimensiune, String tip) {
        this.dimensiune = dimensiune;
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "dimensiune=" + dimensiune +
                ", tip='" + tip + '\'' +
                '}';
    }
}
