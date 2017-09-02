package com.company.Lab6;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,a,b;
        x = s.nextInt();
        a = 0;
        b = 1;
        if (x<0){
            System.out.println("Значение X должно быть положительным");
            return;
        }
        while (a<=x){
            if (x%b ==0){
                System.out.print(b+" ");

                a++;
                b++;
            }
        }

    }
}
