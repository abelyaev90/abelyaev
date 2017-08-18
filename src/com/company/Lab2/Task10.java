package com.company.Lab2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Integer xlnGrad;
        Double result, xlnRad;
        Scanner s = new Scanner(System.in);
        xlnGrad = s.nextInt();
        xlnRad = xlnGrad*(Math.PI/180);
        result = Math.sin(xlnRad);
        System.out.printf("%8.4f",result);
    }
}
