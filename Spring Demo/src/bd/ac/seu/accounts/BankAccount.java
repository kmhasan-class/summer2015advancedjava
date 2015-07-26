/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.accounts;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract BankAccount class gives us the basic setup for
 * a bank account.
 * 
 * This class must be extended to create other subtypes of
 * bank accounts.
 * 
 * @author kmhasan
 */
public abstract class BankAccount {
    private int id;
    private String name;
    private double balance;
    private Address address;
    private List<Phone> phones;

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.address = null;
        this.phones = new ArrayList<>();
    }

    /**
     * Withdraws a certain amount from the balance.
     * 
     * This method simply checks if the amount is positive and if
     * it is less than or equal to the amount we have as balance.
     * If not this method does not do anything.
     * 
     * @param amount must be positive and less than or equal to balance
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance = balance - amount;
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount > 0)
            balance = balance + amount;
        else throw new NegativeNumberException();
    }
    
    /**
     * Returns the id of the bank account.
     * 
     * @return the id of the bank account
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Address getAddress() {
        return address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
    
    public void addPhoneNumber(Phone phone) {
        phones.add(phone);
    }

    @Override
    public String toString() {
        return "BankAccount{" + "id=" + id + ", name=" + name + ", balance=" + balance + ", address=" + address + ", phones=" + phones + '}';
    }
}

