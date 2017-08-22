package com.company.Lab2;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Double radius, h, r;
        Scanner s = new Scanner(System.in);
        h = s.nextDouble();
        radius = 6350.0;
        if (h < 0) {
            System.out.println("Высота над уровнем Земли должна быть неотрицательна");
        } else {

            r = Math.sqrt(Math.pow((h + radius), 2) - Math.pow(radius, 2));
            System.out.printf("%8.4f", r);
        }

    }
}
