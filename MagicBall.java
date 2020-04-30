package com.company;

import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        String[] answers = {"Да","Нет","Скорее всего да","Скорее всего нет","Возможно","Имеются перспективы","Вопрос задан неверно"};
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Задай вопрос магическому шару: ");
            String question = in.nextLine();
            if (question.equals("exit")) break;
            System.out.println(answers[(int)(Math.random() * (answers.length + 1) - 1)] + "\n");
        }
    }
}
