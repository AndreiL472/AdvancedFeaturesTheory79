package com.javaremotero79.part2_oop_principles.abstraction;

public abstract class Game {

    abstract void initializa();
    abstract void play();


    public void start() {
        System.out.println("Game is starting...");
    }

    public final String printSlogan() {
        return "Games are nice!";
    }
}
