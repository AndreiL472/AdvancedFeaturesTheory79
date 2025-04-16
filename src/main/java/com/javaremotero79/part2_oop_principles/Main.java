package com.javaremotero79.part2_oop_principles;

import com.javaremotero79.part2_oop_principles.encapsulation.UserAccount;
import com.javaremotero79.part2_oop_principles.inheritance.Chef;
import com.javaremotero79.part2_oop_principles.inheritance.Emloyee;
import com.javaremotero79.part2_oop_principles.inheritance.Waiter;

public class Main {
    public static void main(String[] args) {

        /* Encapsulation */
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("Jianu14");
        userAccount.setPassword("catelusCuParulCret14");

        System.out.println(userAccount.getUsername() + "\n");

        /* Inheritance */

        Emloyee employee = new Emloyee("1234", "Andrei", "lica", 28);
        Chef chef = new Chef("1235", "Monica", "Lica", 55, "Ajutro de bucatar");
        Waiter waiter = new Waiter("3869", "mocanu", "ion", 32, 56.2);

        System.out.println("Input din parent class Employee: " + employee.generateText());
        employee.sayHi();

        System.out.println("Input din parent class Chef: " + chef.generateText());
        chef.sayHi();

        System.out.println("Input din parent class Waiter: " + waiter.generateText());
        waiter.sayHi();
    }
    }





