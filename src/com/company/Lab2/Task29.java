package com.company.Lab2;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Double x,r,a1, a2;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        if (x<=0 | x<5) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        }else{
            a1 = x+5;
            a2 = x-5;
            r  =(Math.sqrt(a1) + Math.sqrt(a2))/2*(Math.sqrt(x));
            System.out.printf("%8.6f", r);
        }
    }
}
