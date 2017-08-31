package com.company.Lab6;

import java.util.Scanner;

public class Task25_2 {
    public static void main(String[] args) {
        int y, n;
        n = 0;
        Scanner s = new Scanner(System.in);
        y = s.nextInt();
        if (y < 0 || y > 15) {
            System.out.println("Значение Y должно быть в интервале [0, 15]");
            return;
        }
        while (n < 15) {
            if (n < y) {
                System.out.print("#");
            } else {
                System.out.print(".");
            }
            n++;
        }
    }
}
