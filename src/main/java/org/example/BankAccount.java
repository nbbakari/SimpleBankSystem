package org.example;
/**
 * The goal of this small program is to refresh my Encapsulation knowledge,
 * Mostly focus on hiding actual data from the of the program
 *
 */

public class BankAccount {

    private double balance;
    private Person holder;
    private int accoutNumber;
    private int account_type;
    private int ssn;


    /**
     * Assuming the user create a new bankaccount without a deposit
     * THis constructor should do the job
     */
    public BankAccount(Person holder, int account_type){
        this.holder = holder;
        this.balance = 0;
        this.account_type = account_type;
        this.accoutNumber = generateNumber();
    }

    /**
     * When a user creates new account with a deposit upfront
     * @param balance
     */
    public BankAccount(double balance, Person holder){
        this.holder = holder;
        this.balance = balance;
        this.accoutNumber = generateNumber();
    }

    public boolean deposit(double amount){
        if(amount <= 0){
            return false;
        }
        this.balance =+ amount;
        return true;
    }

    public String withdraw(double amount){
        if(this.balance < amount || this.balance <= 0){
            return "insufficient funds: balance " + this.balance;
        }
        this.balance =- amount;
        return "Remaining balance: " + this.balance;
    }

    public int generateNumber(){
        return (int) Math.random() * 100;
    }

}
