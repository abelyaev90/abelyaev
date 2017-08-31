package com.company.Lab6;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        int y, n;
        n = 0;
        Scanner s = new Scanner(System.in);
        y = s.nextInt();
        if (y < 0) {
            System.out.println("Значение Y должно быть в интервале [0, 15]");
            return;
        }
        if (y > 15) {
            System.out.println("Значение Y должно быть в интервале [0, 15]");
            return;
        }
        while (n < y) {
            System.out.print("#");
            n++;
        }
        while (y < 15) {
            System.out.print(".");
            y++;
        }
    }
}
