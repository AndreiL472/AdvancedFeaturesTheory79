package com.javaremotero79.part2_oop_principles;

import com.javaremotero79.part2_oop_principles.encapsulation.UserAccount;

public class Main {
    public static void main(String[] args) {

        /* Encapsulation */
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("Jianu14");
        userAccount.setPassword("catelusCuParulCret14");

        System.out.println(userAccount.getUsername());
    }
}
