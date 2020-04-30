package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        int guess = 0;
        int countOfGuess = 0;
        int guessedNumber = (int) (Math.random() * 100);
        System.out.println("Компьютер загадал число от 1 до 100. У вас 10 попыток его отгадать." +
                "\nПосле каждой неудачной попытки компьютер сообщит, меньше или больше загаданное число. Удачи!" + guessedNumber);
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите ваш вариант: ");
            guess = in.nextInt();
            countOfGuess++;
            if (guess == guessedNumber) {
                System.out.println("Вы угадали!");
                break;
            } else {
                if (countOfGuess >= 10) {
                    System.out.println("Попытки закончились!");
                    break;
                }
            }
            if (guessedNumber > guess) {
                System.out.println("Попробуйте еще! Загаданное число больше, чем ваше!");
            } else {
                System.out.println("Попробуйте еще! Загаданное число меньше, чем ваше!");
            }
        }
    }
}
