package com.company.Lab7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String EAN;
        int n;
        EAN = s.nextLine();
        n = EAN.length();
        if (n != 12) {
            System.out.println("Некорректная длина штрих-кода");
        } else {
            System.out.println("Код страны:" + EAN.substring(0, 2));
            System.out.println("Код изготовителя:" + EAN.substring(3, 6));
            System.out.println("Код товара:" + EAN.substring(7, 11));
            System.out.println("Контрольное число:" + EAN.substring(12));
        }
    }
}