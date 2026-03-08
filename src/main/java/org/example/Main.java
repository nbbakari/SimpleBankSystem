package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {

        /**
         * FInish this small project and send it to gitHub
         *
         * Build a complete small banking system account management
         */




        /**
         * This is for testing the java String methz od
         *
         */
        Person p1 = new Person("nb bakari", 21);

        BankAccount bank1 = new BankAccount(p1);

        System.out.println(bank1.getHolderName());


    }
}

