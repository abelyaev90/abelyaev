package com.company.Lab6;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w, a, b, c, d, e, f, g, h;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        w = s.nextInt();
        if (w < 0 || w > 20) {
            System.out.println("Значение W должно быть в интервале [0, 20]");
            return;
        }
        while (a < w) {
            System.out.print("a");
            a++;
            if (a == w) {
                System.out.println("\n");
            }
        }
        while (b < w) {
            System.out.print("b");
            b++;
            if (b == w) {
                System.out.println("\n");
            }
        }
        while (c < w) {
            System.out.print("c");
            c++;
            if (c == w) {
                System.out.println("\n");
            }
        }
        while (d < w) {
            System.out.print("d");
            d++;
            if (d == w) {
                System.out.println("\n");
            }
        }
        while (e < w) {
            System.out.print("e");
            e++;
            if (e == w) {
                System.out.println("\n");
            }
        }
        while (f < w) {
            System.out.print("f");
            f++;
            if (f == w) {
                System.out.println("\n");
            }
        }
        while (g < w) {
            System.out.print("g");
            g++;
            if (g == w) {
                System.out.println("\n");
            }
        }
        while (h < w) {
            System.out.print("h");
            h++;
            if (h == w) {
                System.out.println("\n");
            }
        }
    }
}

