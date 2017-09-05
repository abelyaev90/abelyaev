package com.company.Lab6;

import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {
        Integer a,b, x1, x2;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        if (a<=b) {
            x1 = a;
            x2 = b;
        }else {
            x1 = b;
            x2 = a;
        }
        while (x1<=x2) {
            System.out.print(" "+x1);
            x1++;
        }

    }
}
