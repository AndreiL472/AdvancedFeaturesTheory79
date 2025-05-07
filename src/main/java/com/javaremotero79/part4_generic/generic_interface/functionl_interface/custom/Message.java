package com.javaremotero79.part4_generic.generic_interface.functionl_interface.custom;

/*
   Functional interfaces:
  - este o simpla interfata Java cu EXACT o metoda abstracta
  - putem avea mai multe metode default sau statice, insa mereu una singura abstracta
  - atat metodele default cat si cele statice trebuie sa aiba un corp de implementare
  - metoda abstracta pe care o definim devine target al tipului de expresie lambda (neparametrizata sau parametrizata)
  - interfetele functionale sunt marcate de @FunctionalInterface

 Asociere prieteneasca: (INPUT) -> (OUTPUT)
   -input: reprez argumentele metodei
   =output: reprez rezultatul in urma metodei
     --void
     --returnabil
 Expresia lambda generica: (<iteratori>) - > {business logic care sa produce rezultatul metodei}
 - nu este nevoie sa utilizam keywordul return IN CAZUL IN CARE implementarea este un one-liner
  insa, aca implementarea e mai compleza va fi nevoie de acolade {} si de return
  -totodata, rezultatul MEREU trebuie sa fie de tipul de date al metodei

  Putem discuta despre 2 categorii de interfete functionale raportate la numarul de argumente ale metodelor
  abstracte:
   - metode neparametrizate:
   - metode parametrizate
 */
@FunctionalInterface
public interface Message {

    String display();

}
