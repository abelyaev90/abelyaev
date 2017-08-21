package com.company.Lab2;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Double a, b, clnGrad,result;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        clnGrad = s.nextDouble();
        result = Math.sqrt(a*a + b*b - 2*a*b*Math.cos((clnGrad*Math.PI)/180));
        System.out.printf("%8.4f", result);
    }
}
