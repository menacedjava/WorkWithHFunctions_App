package org.example;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashGenerator {
    public static String generateHash(String input, String algorithm) {
        try {
            // MessageDigest obyekti hosil qilish
            MessageDigest md = MessageDigest.getInstance(algorithm);
            byte[] hashBytes = md.digest(input.getBytes());

            // Hashni 16-lik formatga o'zgartirish
            StringBuilder hashString = new StringBuilder();
            for (byte b : hashBytes) {
                hashString.append(String.format("%02x", b));
            }
            return hashString.toString();
        } catch (NoSuchAlgorithmException e) {
            return "Xato: Yaroqli algoritm tanlang (MD5, SHA-1, SHA-256).";
        }
    }
    public static void main(String[] args) {

    }
}