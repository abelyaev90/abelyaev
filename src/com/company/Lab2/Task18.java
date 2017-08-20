package com.company.Lab2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Double x1, x2, x3, R;
        Scanner s = new Scanner(System.in);
        x1 = s.nextDouble();
        x2 = s.nextDouble();
        x3 = s.nextDouble();
        R = x1*x2 + x1*x3 + x2*x3;
        System.out.println(R);
    }
}
