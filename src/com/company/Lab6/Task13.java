package com.company.Lab6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Integer a, b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        if (a < b) {
            System.out.println((b * (b + 1)) / 2 - ((a - 1) * ((a - 1) + 1)) / 2);
        } else {
            System.out.println((a * (a + 1)) / 2 - ((b - 1) * ((b - 1) + 1)) / 2);
        }
    }
}