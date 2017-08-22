package com.company.Lab2;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Double x1, x2, result;
        Scanner s = new Scanner(System.in);
        x1  = s.nextDouble();
        x2  = s.nextDouble();
        result = Math.sqrt(x2*x2+x1*x1);
        System.out.printf("%8.4f",result);
    }
}
