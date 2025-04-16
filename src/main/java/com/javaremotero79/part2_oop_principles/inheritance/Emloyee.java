package com.javaremotero79.part2_oop_principles.inheritance;

public class Emloyee {
    /*
     Definitie: mostenirea permite unei clase (clasa copil/sub-clasa)
     sa preia proprietati si metode dintr-o clasa existenta(clasa parinte/clasa de baza).
    */

    protected String id;
    protected String name;
    protected String  surname;
    protected int age;

    public Emloyee(String id,
                   String name,
                   String surname,
                   int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void sayHi() {
        System.out.println("Hi! im an employee!");
    }
    public final String generateText() {
        return "test test test";

    }
}
