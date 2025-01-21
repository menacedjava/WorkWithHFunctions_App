package org.example;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashGenerator {
    public static String generateHash(String input, String algorithm) {
        try {

            MessageDigest md = MessageDigest.getInstance(algorithm);
            byte[] hashBytes = md.digest(input.getBytes());


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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hash funksiyalari bilan ishlash dasturi");
        System.out.println("1. MD5");
        System.out.println("2. SHA-1");
        System.out.println("3. SHA-256");
        System.out.print("Tanlovni kiriting (1, 2 yoki 3): ");
//        int choice = scanner.nextInt();
        scanner.nextLine();
    }
}