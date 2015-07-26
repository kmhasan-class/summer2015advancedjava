/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.accounts;


public class SavingsAccount extends BankAccount {

    public SavingsAccount(int id, String name, double balance) {
        super(id, name, balance);
    }

    @Override
    public void deposit(double amount) throws NegativeNumberException {
        super.deposit(amount * 1.10);
    }
    
}

