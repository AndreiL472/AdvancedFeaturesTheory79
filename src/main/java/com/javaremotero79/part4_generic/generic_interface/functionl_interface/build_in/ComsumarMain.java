package com.javaremotero79.part4_generic.generic_interface.functionl_interface.build_in;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/*
* Consumer = e o I.F. care primeste un argument si rezultatul metodei e void
*  - Obs: o putem considera inversul lui Supplier care nu primea nimic si intorcea un rezultat non-non void
* */
public class ComsumarMain {
    public static void main(String[] args) {
        Consumer<String> printer =  msg -> System.out.println("Message: " +msg);
        printer.accept("Sunt un pinguin!");

        Consumer<List<String>> freqMapper = list -> {
            Map<String, Integer> freq = new HashMap<>();
            for (String it: list) {
                freq.put(it, freq.getOrDefault(it, 0) + 1);
            }
            System.out.println(freq);
        };
        freqMapper.accept(List.of("ana", "are", "mere", "si", "ana", "are","are","are", "pere"));
    }
}
