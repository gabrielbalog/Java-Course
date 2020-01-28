package com.company;

public class BankAccount {

    private int number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount() {
        this(123, 0.0, "Default", "email@example.com", "5432");
        System.out.println("Empty Constructor called");
    }

    public BankAccount(int number, double balance, String name, String email, String phone) {
        System.out.println("Constructor with params called");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " deposited! Your current balance is: " + this.getBalance());
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("You don't have sufficient balance to do this withdraw ("+ amount + "). Your balance: " + balance);
        } else {
            this.balance -= amount;
            System.out.println(amount + " removed! Your current balance is: " + this.getBalance());
        }
    }


}
