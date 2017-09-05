package com.company.Lab6;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s;
        int w, h, b, c;
        s = a.nextLine();
        w = a.nextInt();
        h = a.nextInt();
        if (w < 0) {
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }
        if (h < 0) {
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }
        for (c = 0; c < h; c++) {
            b = 0;
            while (b < w) {
                System.out.print(s);
                b++;
            }
            System.out.println("\n");
        }
    }
}

