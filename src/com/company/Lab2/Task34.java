package com.company.Lab2;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Double alnGrad, blnGrad, alnRad, blnRad, result;
        Scanner s = new Scanner(System.in);
        alnGrad = s.nextDouble();
        blnGrad = s.nextDouble();
        alnRad = (alnGrad*Math.PI)/180;
        blnRad = (blnGrad*Math.PI)/180;
        result = 3*Math.sin(2*alnRad)*Math.cos(3*blnRad);
        System.out.printf("%8.4f",result);
    }
}
