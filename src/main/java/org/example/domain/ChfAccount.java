package org.example.domain;

// Exercise 2 Alex Issue A ChfAccount Class, Part 1
public class ChfAccount {
    String name;
    Double balance;
    public ChfAccount(String name) {
        this.name = name;
        this.balance = 0.0;
    }
    public void deposit(Amount amount) {
        if (amount.currency() != Currency.CHF) {throw new RuntimeException();}
        this.balance += amount.amount();
    }
    public Amount getBalance() {
        return Amount.of(this.balance, Currency.CHF);
    }
    public String toString() {
        return this.name + " has " + this.balance;
    }
}