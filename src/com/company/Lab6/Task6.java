package com.company.Lab6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Integer a,b, x1, x2;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        if (a<b){
            x1 = a;
            while (x1<=b){
                System.out.print(" "+ x1);
                x1++;
            }
        }else{
            x2=b;
            while (x2<=a){
                System.out.print(" " + x2);
                x2++;
            }
        }
    }
}
