package com.company.Lab2;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Double x, r,a;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        x = (a*Math.PI)/180;
        r = Math.sqrt(1-(Math.sin(x)*Math.sin(x)));
        System.out.printf("%8.4f",r);
    }
}
