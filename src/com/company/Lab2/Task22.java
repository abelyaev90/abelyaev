package com.company.Lab2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Double mass, alnGrad, result, g, alnRad;
        g = 9.8067;
        Scanner s = new Scanner(System.in);
        mass = s.nextDouble();
        alnGrad = s.nextDouble();
        if (mass <= 0 ) {
            System.out.println("Масса должна быть положительной");
        } else{
            alnRad =(alnGrad*Math.PI)/180;
            result = mass*g*Math.cos(alnRad);
            System.out.printf("%8.6f",result);
        }
    }
}
