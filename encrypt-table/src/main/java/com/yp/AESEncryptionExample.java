package com.yp;

import org.apache.commons.codec.digest.DigestUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.util.Base64;

public class AESEncryptionExample {

    public static void main(String[] args) throws Exception {


        String plaintext = "root";
        String key = "123qweasd"; // AES密钥，长度为16字节（128位）

        // 对密钥进行填充，使其长度达到128位
        byte[] paddedKey = Arrays.copyOf(DigestUtils.sha1(key), 16);
        // 创建AES密钥规格对象
        SecretKeySpec secretKey = new SecretKeySpec(paddedKey, "AES");
        // 创建AES加密器
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // 加密数据
        byte[] encryptedData = cipher.doFinal(plaintext.getBytes());

        // 将加密后的数据转换为Base64字符串
        String encryptedBase64 = Base64.getEncoder().encodeToString(encryptedData);

        // 输出加密后的Base64字符串
        System.out.println("Encrypted Base64 String: " + encryptedBase64);
    }
}
