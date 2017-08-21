package com.company.Lab2;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Double a, b, c, discriminant;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        if (a == 0) {
            System.out.println("Данное уравнение не является квадратным");
        } else{
            discriminant = b*b - 4*a*c;
            System.out.printf("%8.4f",discriminant);
        }
    }
}
