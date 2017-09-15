package com.company.Lab7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String str = "abcdefwxyz";
        String x;
        int a;
        Scanner s = new Scanner(System.in);
        x = s.nextLine();
        if (str.contains(x)) {
            a = 9 - str.indexOf(x);
            System.out.println(a);
        } else {
            System.out.println("Значение отсутствует в строке");
        }

    }
}

