package com.company;

import java.util.Scanner;

public class LetterAdder {
    private static final String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя" ;

    public static void main(String[] args) {
        int summOfLetters = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your words: ");
        String words = in.nextLine();

        for (char i : words.toCharArray()) {
            summOfLetters += numInAlphabet(i);
        }
        System.out.println("The sum of Russian letters is " + summOfLetters);
    }

    public static int numInAlphabet(char letter) {
        letter = Character.toLowerCase(letter);
        int indexOfLetter = ALPHABET.indexOf(letter) + 1;
        if ( indexOfLetter > 0) {
            return indexOfLetter;
        }
        return 0;
    }
}
