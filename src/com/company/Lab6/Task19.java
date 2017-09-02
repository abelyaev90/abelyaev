package com.company.Lab6;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,a,b;
        a=0;
        b=0;

        do {
            n = s.nextInt();
            if (n<=83){
                a++;
            }else{
                b++;
            }
        }
        while (n<=83 || n>=199);
        if (n>83) {
            System.out.print("Количество слева: " + a + ", Количество справа: " + (b-1));
        }else{
            System.out.println("Количество слева: " + (a-1) + ", Количество справа: " + b);
        }
    }
}
