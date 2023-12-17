package gr.aueb.cf.ch7;

import java.util.Scanner;

public class EncryptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedString;
        String userString;
        userString = scanner.nextLine();

        encryptedString = encrypt(userString);
        System.out.println("Encrypted text: " + encryptedString);
        System.out.println("Decrypted text: " + decrypt(encryptedString));
    }
    public static String encrypt(String input) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char encryptedChar = (char) (c + 1);
            encryptedText.append(encryptedChar);
        }

        return encryptedText.toString();
    }
    public static String decrypt(String input) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char decryptedChar = (char) (c - 1);
            decryptedText.append(decryptedChar);
        }

        return decryptedText.toString();
    }

}
