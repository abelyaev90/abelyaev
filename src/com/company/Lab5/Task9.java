package com.company.Lab5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Double Sc, Ss, a, r1;
        Scanner s = new Scanner(System.in);
        Sc = s.nextDouble();
        Ss = s.nextDouble();
        if (Sc < 0) {
            System.out.println("Площадь круга должна быть положительной");
            return;
        }
        if (Ss < 0) {
            System.out.println("Площадь квадрата должна быть положительной");
            return;
        }
        a = Math.sqrt(Ss);
        r1 = (Math.sqrt(Sc / Math.PI))*2;
        if (r1 > a) {
            System.out.println("Круг не поместится в квадрате");
        } else {
            System.out.println("Круг уместится в квадрате");
        }
    }
}
