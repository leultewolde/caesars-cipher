package com.leultewolde;

public class Main {
    public static void main(String[] args) {

        String message = "how are you doing today";
        int offset = 11;

        CaesarsCipher caesarsCipher = new CaesarsCipher();
        String result = caesarsCipher.cipher(message, offset);

        System.out.println("Message: " + message);
        System.out.println("Offset: " + offset);
        System.out.println("Ciphered message: " + result);
    }
}