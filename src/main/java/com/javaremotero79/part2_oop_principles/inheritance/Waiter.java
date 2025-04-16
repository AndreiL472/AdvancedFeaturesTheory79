package com.javaremotero79.part2_oop_principles.inheritance;

public class Waiter extends Emloyee {

    private double tips;

    public Waiter(String id,
                  String name,
                  String surname,
                  int age,
                  double tips) {
        super(id, name, surname, age);
        this.tips = tips;
    }

    @Override
        public void sayHi() {
            System.out.println("Hi! i am a waiter!");
        }
    }

