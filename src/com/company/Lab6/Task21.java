package com.company.Lab6;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        int x, a;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        for (a = 10; a <= 20; a++) {
            if (x == a) {
                System.out.println(a + "+");
            } else {
                System.out.println(a);
            }
        }

    }
}


