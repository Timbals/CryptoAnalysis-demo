package main.java.org.cambench.cap.basic.brokencrypto;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoBCase2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance("DES");
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
