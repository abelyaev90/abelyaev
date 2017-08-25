package com.company.Lab5;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        if (x == y || x == z || y == z) {
            System.out.println("Среди чисел есть равные");
        }else{
            System.out.println("Числа не равны друг другу.");
        }
    }
}
