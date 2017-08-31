package com.company.Lab6;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int sum;
        int count;
        sum = 0;
        count = 0;
        do {
            a = s.nextInt();
            sum = sum + a;
            count ++;
        }
        while (a != 0);
        System.out.print("Сумма чисел: " + sum);
        System.out.println(", Количество чисел: " + count);
    }
}

