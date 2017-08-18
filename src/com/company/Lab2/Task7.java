package com.company.Lab2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Integer alnGrad;
        Float alnRad;
        Scanner s = new Scanner(System.in);
        alnGrad = s.nextInt();
        alnRad = alnGrad*((float)Math.PI/180);
        System.out.printf("%8.4f", alnRad);
    }
}
