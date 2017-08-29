package com.company.Lab2;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Double mass1, mass2, force, distance, g;
        g = 9.8067;
        Scanner s = new Scanner(System.in);
        mass1 = s.nextDouble();
        mass2 = s.nextDouble();
        distance = s.nextDouble();
        if (mass1 <= 0) {
            System.out.println("Масса должна быть неотрицательной");
            return;
        }
        if (mass2 < 0) {
            System.out.println("Масса должна быть неотрицательной");
            return;
        }
        if (distance < 0) {
            System.out.println("Дистанция должна быть неотрицательной");
            return;
        }
        force = g * ((mass1 * mass2) / (distance * distance));
        System.out.printf("%8.4f", force);

    }
}