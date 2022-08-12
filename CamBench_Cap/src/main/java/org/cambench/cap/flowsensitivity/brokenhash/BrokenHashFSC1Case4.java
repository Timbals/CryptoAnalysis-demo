package main.java.org.cambench.cap.flowsensitivity.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashFSC1Case4 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
        messageDigest = MessageDigest.getInstance("SHA-256");
    }
}
