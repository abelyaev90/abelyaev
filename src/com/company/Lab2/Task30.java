package com.company.Lab2;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Double alnGrad, blnGrad, alnRad, blnRad, result;
        Scanner s = new Scanner(System.in);
        alnGrad = s.nextDouble();
        blnGrad = s.nextDouble();
        alnRad = (alnGrad*Math.PI)/180;
        blnRad = (blnGrad*Math.PI)/180;
        result = Math.sin(alnRad)*Math.cos(blnRad)+Math.cos(alnRad)*Math.sin(blnRad);
        System.out.printf("%8.4f",result);
    }
}
