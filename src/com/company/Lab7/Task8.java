package com.company.Lab7;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String str = "abcdefwxyz";
        Scanner s = new Scanner(System.in);
        int ca, cb;
        ca = s.nextInt();
        cb = s.nextInt();
        if (ca < 0) {
            System.out.println("Значение CA должно быть в интервале [0, длина строки)");
            return;
        }
        if (cb < 0) {
            System.out.println("Значение CB должно быть неотрицательно");
            return;
        }
        if (ca + cb > 9) {
            System.out.println("Сумма значений CA и CB должна быть меньше длины строки");
            return;
        }
        System.out.print(str.substring(0, (ca)));
        System.out.println(str.substring((ca + cb), 10));

    }
}
