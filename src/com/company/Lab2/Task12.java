package com.company.Lab2;

import java.util.Scanner;

public class Task12{
    public static void main(String[] args) {
        Double yInGrad, result, yInRad;
        Scanner s = new Scanner(System.in);
        yInGrad = s.nextDouble();
        yInRad =(yInGrad*Math.PI)/180;
        result = 5*Math.cos(yInRad);
        System.out.printf("%8.4f",result);


    }
}
