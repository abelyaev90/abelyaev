package com.company.Lab5;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Double A, B, C;
        Scanner s = new Scanner(System.in);
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        if (A < B && B < C){
            System.out.println("Выполняется");
        }else{
            System.out.println("Не выполняется");
        }

    }
}
