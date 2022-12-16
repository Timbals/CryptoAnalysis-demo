package main.java.org.cambench.cap.mixedsensitivities.objectpath.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CorrectedHash {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        HashClass hashObject1 = new HashClass("SHA-256");
        String data = "some data here";

        messageDigest = MessageDigest.getInstance(hashObject1.algorithm);

        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static class HashClass {
        String algorithm;

        public HashClass(String algo){
            algorithm = algo;
        }
    }
}