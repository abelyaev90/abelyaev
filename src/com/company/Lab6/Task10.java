package com.company.Lab6;

public class Task10 {
    public static void main(String[] args) {
        Integer a, b, sum;
        a = 100;
        b = 500;
        sum = 0;
        System.out.print("Ход решения: ");
        while (a <= b) {
            sum = sum + a;
            System.out.print(" "+sum);
            a++;

        }
        System.out.print("\nОтвет: " + sum);
    }
}
