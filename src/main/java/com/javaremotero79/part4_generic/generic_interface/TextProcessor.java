package com.javaremotero79.part4_generic.generic_interface;

public class TextProcessor implements DataProcessor<String> {

    @Override
    public void process(String item) {
        System.out.println("Processing: " + item);

    }

    @Override
    public boolean validate(String item) {
        return item != null && !item.isEmpty();
    }

    @Override
    public String serialize(String item) {
        return "\"" + item + "\"";
        // a doua ghilimea este un special escape character pt a putea afisa caracterul dorit

    }
}
