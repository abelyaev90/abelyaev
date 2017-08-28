package com.company.Lab5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Double x, y, z;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        if (x > 0) {
            System.out.printf("%8.4f", x * x);
            System.out.print("; ");
        } else {
            System.out.print(x);
            System.out.print("; ");
        }
        if (y > 0) {
            System.out.printf("%8.4f", y * y);
            System.out.print("; ");
        } else {
            System.out.print(y);
            System.out.print("; ");
        }
        if (z > 0) {
            System.out.printf("%8.4f", z * z);
            System.out.print("; ");
        } else {
            System.out.print(z);
            System.out.print("; ");
        }
    }
}
