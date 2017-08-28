package com.company.Lab5;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Integer a, b, c;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if (a < 0) {
            System.out.println("Значение A должно быть неотрицательным");
            return;
        }
        if (b < 0) {
            System.out.println("Значение B должно быть неотрицательным");
            return;
        }
        if (c < 0) {
            System.out.println("Значение C должно быть неотрицательным");
            return;
        }

        if (a == b || a == c || b == c ) {
            System.out.println("Треугольник является равнобедренным.");
            return;
        }
        if (a.equals(b) & b.equals(c) & c.equals(a)){
            System.out.println("Треугольник является равнобедренным.");
        } else {
            System.out.println("Треугольник не является равнобедренным.");
        }
    }
}
