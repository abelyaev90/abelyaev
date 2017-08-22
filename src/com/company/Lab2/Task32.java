package com.company.Lab2;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Double a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = 12*a*a+7*a-16;
        System.out.printf("%8.4f",b);
    }
}
