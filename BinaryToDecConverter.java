package com.company;

import java.util.Scanner;

public class BinaryToDecConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в двоичной системе счисления: ");
        String binaryNum = in.nextLine();
        int decimalNum = Integer.parseInt(binaryNum, 2);
        System.out.println("Ваше число в двоичной системе счисления равно " + decimalNum);
    }
}
