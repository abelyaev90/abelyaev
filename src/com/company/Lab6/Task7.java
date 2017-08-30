package com.company.Lab6;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Integer a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        if (a<b){
            while (a<=b){
                System.out.print(" "+a);
                a++;
            }
        }else{
            while (a>=b){
                System.out.print(" "+a);
                a--;
            }
        }
    }
}
