package com.company.Lab6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Long a, b, pr;
        Scanner s = new Scanner(System.in);
        a = s.nextLong();
        b = s.nextLong();
        pr = 1L;
        if (a <= b) {
            while (a <= b) {
                pr = pr * a;
                a++;
            }
            System.out.println(pr);
        } else {
            while (b <= a) {
                pr = pr * b;
                b++;
            }
            System.out.println(pr);
        }
    }
}
