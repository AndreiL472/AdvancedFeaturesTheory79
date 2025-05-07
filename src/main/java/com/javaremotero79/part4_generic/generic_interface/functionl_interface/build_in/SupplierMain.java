package com.javaremotero79.part4_generic.generic_interface.functionl_interface.build_in;

/*
  Supplier = este o interfata care nu primeste niciun argument si intoarce ca rezultat

 */

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {

    static class Athlete{
        private String name;
        private int age;
        private List<String> medals;

        public Athlete(String name, int age, List<String> medals) {
            this.name = name;
            this.age = age;
            this.medals = medals;
        }

        @Override
        public String toString() {
            return "Athlete{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", medals=" + medals +
                    '}';
        }
    }
    public static void main(String[] args) {
        Supplier<String> sayHello = () -> "Hello!";
        System.out.println(sayHello.get());

        Supplier<Integer> generateRandom = () -> {
            int result = new Random().nextInt();
            //se pot face prelucrari intense asupra structurii numarului
            return result;
        };
        System.out.println("Numarul random este: " + generateRandom.get());

        Supplier<Athlete> athleteSupplier = () ->new Athlete(
                "Marcel",
                23,
                List.of("Aur", "Argint", "Bronz")
        );
        System.out.println(athleteSupplier.get());

    }
}
