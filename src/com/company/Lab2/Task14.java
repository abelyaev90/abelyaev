package com.company.Lab2;

import java.util.Scanner;

public class Task14  {
    public static void main(String[] args) {
        Double A,B, result;
        Scanner s = new Scanner(System.in);
        A = s.nextDouble();
        B = s.nextDouble();
        if (B>0) {
            System.out.println("Значение B должно быть не положительным");
        }else{
            result = A*Math.sqrt((-7*B));
            System.out.printf("%8.4f",result);
        }
    }
}
