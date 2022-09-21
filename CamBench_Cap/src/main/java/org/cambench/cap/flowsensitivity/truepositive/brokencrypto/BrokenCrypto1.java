package main.java.org.cambench.cap.flowsensitivity.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("Blowfish");
        KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());

        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    }
}