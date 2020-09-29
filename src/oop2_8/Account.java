/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_8;

/**
 *
 * @author Admin
 */
public class Account {

    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%30s balance =$%7.2f", this.customer.toString(), this.balance);
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (this.getBalance() < amount) {
            System.err.println("Amount withdrawn exceeds the current balance!");
        } else {
            this.balance -= amount;
        }
        return this;
    }

}
