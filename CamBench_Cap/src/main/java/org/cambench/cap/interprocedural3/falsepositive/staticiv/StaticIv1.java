package main.java.org.cambench.cap.interprocedural3.falsepositive.staticiv;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class StaticIv1 {

    public static void main(String[] args) throws InvalidAlgorithmParameterException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String string = "abcdefghijklmnop";
        method1(string.getBytes());
    }

    public static void method1(byte[] bytes) throws InvalidAlgorithmParameterException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] ivBytes = bytes;
        method2(ivBytes);
    }

    public static void method2(byte[] ivBytes) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");

        SecureRandom secureRandom = new SecureRandom();
        byte[] secureBytes = new byte[16];
        secureRandom.nextBytes(secureBytes);

        IvParameterSpec iv = new IvParameterSpec(secureBytes);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }
}