package com.company.Lab2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Double result, R1, R2;
        Scanner s = new Scanner(System.in);
        R1 = s.nextDouble();
        R2 = s.nextDouble();
        if (R1 == 0 | R2 == 0) {
            if (R1 == 0) {
                System.out.println("Значение r1 должно быть не равно нулю");
            } else {
                System.out.println("Значение r2 должно быть не равно нулю");
            }
        } else {
            result = 1 / R1 + 1 / R2;
            System.out.printf("%8.4f",result);
        }
    }
}