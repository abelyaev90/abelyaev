package com.company.Lab2;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Double xa, ya, xb, yb, ab;
        Scanner s = new Scanner(System.in);
        xa = s.nextDouble();
        ya = s.nextDouble();
        xb = s.nextDouble();
        yb = s.nextDouble();
        ab  = Math.sqrt(Math.pow((xb-xa),2)+ Math.pow((yb-ya),2));
        System.out.printf("%8.4f", ab);
    }
}
