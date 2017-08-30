package com.company.Lab6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Integer a, b, a1, b1;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        a1 = 1;
        for (int i = 2; i <= a; i++)
            a1 *= i;
        b1 = 1;
        for (int j = 2; j <= b; j++)
            b1 *= j;
        if (b > a) {
            System.out.println(b1 - a1);
        } else {
            System.out.println(a1 - b1);
        }
    }
}
