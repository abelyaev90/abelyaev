package com.company.Lab6;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Double n, sum, a;
        Scanner s = new Scanner(System.in);
        n = s.nextDouble();
        a = 2.D;
        sum = 1.D;
        if (n<=0){
            System.out.println("Значение N должно быть положительным");
            return;
        }
        while (a<=n) {
            sum = sum + (1 / a);
            a++;
        }
        System.out.printf("%.4f",sum);
    }
}
