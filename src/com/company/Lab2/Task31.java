package com.company.Lab2;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Double x,y;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = 7*x*x-3*x+6;
        System.out.printf("%8.9f",y);
    }
}
