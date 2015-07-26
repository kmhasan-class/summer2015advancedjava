/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.springdemo;

import bd.ac.seu.accounts.BankAccount;
import bd.ac.seu.accounts.CurrentAccount;
import bd.ac.seu.accounts.NegativeNumberException;
import bd.ac.seu.accounts.Phone;
import bd.ac.seu.accounts.SavingsAccount;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author kmhasan
 */
// Reference: Java Brains Spring Framework Playlist (https://www.youtube.com/playlist?list=PLC97BDEFDCDD169D7)
public class SpringDemo {
    public SpringDemo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BankAccount a = (SavingsAccount) context.getBean("rakib_savings");
        BankAccount b = (CurrentAccount) context.getBean("ashiq_current");
        BankAccount c = (SavingsAccount) context.getBean("monirul_savings");

        try {
            a.deposit(100);
            b.deposit(100);
            c.deposit(100);
        } catch (NegativeNumberException ex) {
            Logger.getLogger(SpringDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringDemo demo = new SpringDemo();
    }
    
}

