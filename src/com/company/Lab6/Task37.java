package com.company.Lab6;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Integer w, h, r, q, p;
        Scanner s = new Scanner(System.in);
        w = s.nextInt();
        h = s.nextInt();
        q = 1;
        p = 1;
        if (w < 0) {
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }
        if (h < 0) {
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }
       /* while (p <=w) {
            for (r =1; r<q; r++) {
                System.out.print("+");
            }
            q++;
            System.out.println();
            p++;
        }*/
    }
}
