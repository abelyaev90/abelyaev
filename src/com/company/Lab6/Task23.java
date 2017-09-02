package com.company.Lab6;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, a, b;
        a = 0;
        b = 0;
        n = s.nextInt();
        if (n<0){
            System.out.println("Значение N должно быть неотрицательным");
            return;
        }
        while (a<n){
            System.out.print("#");
            a++;
            b++;
            if (b%20== 0){
                System.out.println();
            }
        }
    }
}
