package org.example;

public class Main {
    public static void main(String[] args) {
        int palindrome = -121;
        int eqNumber = 0;
        int zikl = palindrome;

        while (zikl != 0) {
            int remainder = zikl % 10;
            zikl = zikl / 10;
            eqNumber = eqNumber * 10 + remainder;
        }

        if (palindrome < 0 || palindrome != eqNumber) {
            System.out.println("false");
        } else System.out.println("true");

    }
}