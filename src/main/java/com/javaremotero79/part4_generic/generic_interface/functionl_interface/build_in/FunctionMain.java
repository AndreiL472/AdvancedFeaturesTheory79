package com.javaremotero79.part4_generic.generic_interface.functionl_interface.build_in;

/*
 Function = e o I. F. care primeste un argument si produce un rezultat
 */

import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {
        //input: String word = "                  hello                ";
        //outpt: String "HELLO"
        Function<String, String> trimAndUpper = it -> {
            String trimmedWord = it.trim();
            return trimmedWord.toUpperCase();
        };
        System.out.println(trimAndUpper.apply(
                "                  hello                "));
        System.out.println("\n------------------");

        Function<Integer, Double> sumaArmonica = number -> {
            double sum = 0.0;
            for (int i = 1; i <= number; i++) {
                sum += 1.0 / i;
            }
            return sum;
        };
        System.out.println(sumaArmonica.apply(3));
    }
}
