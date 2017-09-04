package com.company.Lab6;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        int w,h,h1,w1, h11,w11,c;
        Scanner s = new Scanner(System.in);
        w = s.nextInt();
        h = s.nextInt();
        h1=0;
        w1=0;
        h11=0;
        w11=0;
        if (w<0){
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }
        if (h<0){
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }
        System.out.print(" ");
        while (w1<w){
            System.out.print(w11);
            w11++;
            w1++;
            if (w1==w){
                System.out.println();
            }
            for (h1=0;h1<h;h1++){
                System.out.print(h11);
                while (h1<(h-2)){
                    System.out.print(".");
                h1++;}
                    if (h11==(w1+2)){
                    System.out.println  ("|");
                }
            }
        }
    }
}
