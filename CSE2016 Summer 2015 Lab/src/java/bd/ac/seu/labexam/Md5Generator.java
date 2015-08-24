package bd.ac.seu.labexam;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kmhasan
 */
public class Md5Generator {
    public static String generateMd5(String message) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] hashed = messageDigest.digest(message.getBytes());
            BigInteger hashCode = new BigInteger(1, hashed);
            return hashCode.toString(16);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Md5Generator.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
