package com.javaremotero79.part3_dsa_collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    //todo: incercati sa decuplati cele 2 clase prin definirea lor ca si clase concrete individuale
    //astfel incat sa le apelati direct in main
    static class AnimalComparable implements Comparable<AnimalComparable>{
        private String name;
        private int age;
        private double weight;

        public AnimalComparable(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "AnimalComparable{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }

        @Override
        public int compareTo(AnimalComparable other) {

            int result = Double.compare(this.weight, other.weight);

            if (result==0){
                result = this.name.compareTo(other.name);
            }
            return result;
        }
    }

    static class AnimalComparator{
        private String name;
        private int age;
        private double weight;

        public AnimalComparator(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "AnimalComparable{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }
    }


    public static void main(String[] args) {
        //Example with Comparable
        Set<AnimalComparable> comparableSet = new TreeSet<>();

        comparableSet.add(new AnimalComparable("Elefant", 10, 600.2));
        comparableSet.add(new AnimalComparable("Tigru", 2, 220.21));
        comparableSet.add(new AnimalComparable("Leu", 2, 220.2));
        comparableSet.add(new AnimalComparable("Rinocer", 5, 300.2));
        comparableSet.add(new AnimalComparable("Girafa", 7, 300.2));

        for (AnimalComparable it: comparableSet) {
            System.out.println(it.getWeight()+ " " + it.getName() + " " + it.getAge());


        }
        System.out.println("-----------------------------");

        //Exemplu with Comparator
        Comparator<AnimalComparator> comparatorForAnimals = Comparator
                .comparingInt(AnimalComparator::getAge)
                .thenComparing(AnimalComparator::getName)
                .thenComparing((it1, it2)->Double.compare(it1.getWeight(), it2.getWeight()))
                .reversed();


        Set<AnimalComparator> comparatorSet = new TreeSet<>(comparatorForAnimals);

        comparatorSet.add(new AnimalComparator("Elefant", 12, 788.22));
        comparatorSet.add(new AnimalComparator("Elefant", 12, 500));
        comparatorSet.add(new AnimalComparator("Elefant", 9, 1000));
        comparatorSet.add(new AnimalComparator("Maimuta", 2, 45));
        comparatorSet.add(new AnimalComparator("Ornitorinc", 5, 12));

        for (AnimalComparator it: comparatorSet){
            System.out.println(it.getWeight()+ " " + it.getName() + " " + it.getAge());

        }
    }
}
