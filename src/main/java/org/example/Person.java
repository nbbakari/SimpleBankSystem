package org.example;

public class Person {
    /**
     * Basic info required by a bank branch when opening a bank account
     *
     */

    private String first_name;
    private String last_name;
    private char gender;
    private int ssn;

    public Person(){

    }

    public Person(String first_name, String last_name, char gender, int ssn){
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.ssn = ssn;
    }

    public String getName() {
        return this.first_name + " " + this.last_name;
    }


    public char getGender(){
        return this.gender;
    }

    //SETTERS

    public String changeName(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
        return "Name change success";
    }

    public boolean changeSsn(int ssn){
        this.ssn = ssn;
        return true;
    }


}
