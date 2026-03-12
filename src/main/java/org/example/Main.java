package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccountCreation();
    }

    public static boolean BankAccountCreation(){
        Scanner input = new Scanner(System.in);
        String first_name;
        String last_name;
        Character gender;
        int ssn;
        int accountType;
        System.out.println("---------Lets create your account-----------");
        do {
            System.out.println();
            System.out.print("first name: ");
            first_name = input.nextLine();
        }while(first_name == null);

        do {
            System.out.println();
            System.out.print("last name: ");
            last_name = input.nextLine();
        }while(last_name == null);

        do {
            System.out.println();
            System.out.print("last name: ");
            gender = input.next().charAt(0);
        }while(gender == null);



        do {
            System.out.println();
            System.out.print("S-S-N (0002223333): ");
            ssn = input.nextInt();

            // A social security number format method verifier will be added to the verifier class

        }while(ssn > 1 ? true: false);

        Person person = new Person(first_name, last_name, gender, ssn);
        do {
            System.out.println("Saving = 1  |   Checking = 2: ");
            accountType = input.nextInt();
        } while(!(accountType == 1 || accountType == 2));

        return true;

    }

}

