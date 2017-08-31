package com.company.Lab6;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,x;
        x=0;
        n = s.nextInt();
        if (n<0){
            System.out.println("Значение N должно быть неотрицательным");
            return;
        }
        while (x<n){
            System.out.print("!");
            x++;
            if (x%5==0){
                System.out.print(" ");
            }
        }


    }
}
