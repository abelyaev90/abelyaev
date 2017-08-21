package com.company.Lab2;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Double a, b, c, x, r, y;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        x = s.nextDouble();
        y = a * x * x + b * x + c;
        if (y < 0 | y == 0) {
            if (y < 0) {
                System.out.println("Подкоренное выражение должно быть неотрицательным");
            } else {
                System.out.println("Знаменатель не может быть равен нулю");
            }
        } else {
            r = 1 / Math.sqrt(y);
            System.out.printf("%8.4f", r);
        }
    }
}
