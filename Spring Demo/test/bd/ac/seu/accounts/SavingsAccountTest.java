/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.accounts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author kmhasan
 */
public class SavingsAccountTest {
    private static ApplicationContext context;
    
    public SavingsAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        context = new ClassPathXmlApplicationContext("spring.xml");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deposit method, of class SavingsAccount.
     */
    @Test
    public void testDeposit1() throws NegativeNumberException {
        System.out.println("deposit");
        double amount = 100.0;
        SavingsAccount instance = (SavingsAccount) context.getBean("rakib_savings");
        instance.deposit(amount);
        assertEquals(1110.00, instance.getBalance(), 0.1);
    }

    /**
     * Test of deposit method, of class SavingsAccount.
     * @throws bd.ac.seu.accounts.NegativeNumberException
     */
    @Test(expected=NegativeNumberException.class)
    public void testDeposit2() throws NegativeNumberException {
        System.out.println("deposit");
        double amount = -100.0;
        SavingsAccount instance = new SavingsAccount(101, "Md. Rakibul Hasan", 500.00);
        instance.deposit(amount);
        assertEquals(500.00, instance.getBalance(), 0.00001);
    }
    
    @Test(timeout=2000)
    public void whatever() throws InterruptedException {
        // this method will deliberately cause timeout
        System.out.println("Whatever called");
        Thread.sleep(5000);
    }
}
