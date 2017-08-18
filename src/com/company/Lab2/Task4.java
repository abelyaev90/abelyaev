package com.company.Lab2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Integer radius;
        Float circumference;
        Scanner s = new Scanner(System.in);
        radius = s.nextInt();
        if (radius <= 0) {
            System.out.println("Значение radius должно быть положительным");
        } else {
            circumference = 2*(float)Math.PI*(radius);
            System.out.printf("%8.4f",circumference);
        }

    }
}
