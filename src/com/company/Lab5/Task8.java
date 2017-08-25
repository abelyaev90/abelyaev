package com.company.Lab5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Double a, b, c, d;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Данное уравнение не является квадратным");
            return;
        }
        if (d > 0) {
            System.out.println("У уравнения " + a + "x^2 + " + b + "x" + c + " два вещественных корня");
            return;
        }
        if (d == 0) {
            System.out.println("Уравнения " + a + "x^2 + " + b + "x" + c + " имеет один корень");
            return;
        }
        if (d < 0) {
            System.out.println("Вещественных корней уравнения  " + a + "x^2 + " + b + "x" + c + " нет");

        }

    }
}
