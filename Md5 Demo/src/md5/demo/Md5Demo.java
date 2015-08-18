/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md5.demo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kmhasan
 */
public class Md5Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String username = "abul";
        String password = "abc";
        
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] hashed = messageDigest.digest(password.getBytes());
            BigInteger hashCode = new BigInteger(1, hashed);
            System.out.println(hashCode.toString(16));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Md5Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
