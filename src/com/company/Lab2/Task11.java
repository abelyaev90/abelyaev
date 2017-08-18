package com.company.Lab2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Integer a;
        Double resualt;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if (a>=0) {
            resualt = Math.sqrt(a);
            System.out.printf("%8.4f", resualt);
        }
        else{
            System.out.println("Значение X должно быть неотрицательным");
        }
    }
}
