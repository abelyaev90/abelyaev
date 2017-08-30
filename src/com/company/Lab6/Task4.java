package com.company.Lab6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Integer a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        if (a>b) {
            System.out.println("Значение A должно быть не больше значения B");
        }else{
            while (b>=a){
                System.out.print(" "+b);
                b--;
            }
        }
    }

}
