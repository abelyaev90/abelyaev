package com.company.Lab6;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Integer a, b, q, p, n, r, w,c,h;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        h=8;
        w=1;
        if (a <= b) {
            p = a;
            q = b;
        } else {
            p = b;
            q = a;
        }
        while (p <= q) {

            n = p % 2;

            if (n != 0) {
              for (r=1;r<w;r++){
                  System.out.print(".");
              }
              w++;
                System.out.print(p);
                System.out.println();
            }
            p++;
        }
    }
}