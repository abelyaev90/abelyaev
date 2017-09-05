package com.company.Lab6;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        int w, h, h1, w1, h11, w11, c, w111;
        Scanner s = new Scanner(System.in);
        w = s.nextInt();
        h = s.nextInt();
        w1 = 0;
        w111 = 0;
        if (w < 0) {
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }
        if (h < 0) {
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }
        System.out.print(" ");
        while (w1 < w) {
            System.out.print(w1);
            w1++;
        }
        System.out.print("\n");
        for (h1 = 0; h1 < h; h1++) {
            System.out.print(h1);
            w11 = 0;
            while (w11 < w) {
                System.out.print(".");
                w11++;
            }
            System.out.println("|");

        }
        h++;
        System.out.print(" ");
        while (w111 < w) {
            System.out.print("-");
            w111++;
        }

    }

}


