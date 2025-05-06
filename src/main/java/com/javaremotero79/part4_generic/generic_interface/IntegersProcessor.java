package com.javaremotero79.part4_generic.generic_interface;

public class IntegersProcessor implements DataProcessor<Integer> {

    @Override
    public void process(Integer item) {
        System.out.println("Processing: " + item);

    }

    @Override
    public boolean validate(Integer item) {
        return item != null && item >=0;
    }

    @Override
    public String serialize(Integer item) {
        return "int(" + item + ")";
    }
}
