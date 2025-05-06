package com.javaremotero79.part4_generic.generic_interface;

import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args) {
        DataProcessor<Integer> integerDataProcessor = new IntegersProcessor();

        Integer number = 42;
        if (integerDataProcessor.validate(number)) {
            integerDataProcessor.process(number);
            String result = integerDataProcessor.serialize(number);

            //prelucrare de text
            DataProcessor<String> textDataProcessor = new TextProcessor();
            if (textDataProcessor.validate(result)) {
                textDataProcessor.process(result);
                System.out.println(textDataProcessor.serialize(result));
            }
        } else {
            System.out.println("Numar invalid.");
        }
    }
}
