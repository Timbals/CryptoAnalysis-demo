package main.java.org.cambench.cap.mixedsensitivities.objectpath.truenegative.staticiv;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class StaticIv1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();
        IvParameterSpec iv;

        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        IvClass1 ivObject1 = new IvClass1("abcdefghijklmnop");
        IvClass1 ivObject2 = new IvClass1(randomBytes);
        int condition = 1;

        if(condition == 0){
            iv = new IvParameterSpec(ivObject1.ivBytes);
        } else {
            iv = new IvParameterSpec(ivObject2.ivBytes);
        }

        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }
}

class IvClass1 {
    byte[] ivBytes;

    public IvClass1(String ivString){
        ivBytes = ivString.getBytes();
    }

    public IvClass1(byte[] bytes){ ivBytes = bytes; }
}