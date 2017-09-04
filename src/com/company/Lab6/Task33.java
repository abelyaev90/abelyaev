package com.company.Lab6;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        int w,n,b,d;
        Scanner s = new Scanner(System.in);
        w = s.nextInt();
        n=0;
        b=0;
        d=0;
        if (w<0){
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }
        if (w ==0){
            return;
        }
        System.out.print("+");
        while (n<(w-2)){
            System.out.print("-");
            n++;
        }
        System.out.println("+");
        System.out.print("|");
        while (b<(w-2)){
            System.out.print(".");
            b++;
        }
        System.out.println("|");
        System.out.print("+");
        while (d<(w-2)) {
            System.out.print("-");
            d++;
        }
        System.out.println("+");
    }
}
