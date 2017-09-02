package com.company.Lab6;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Long a, b, sum;
        Scanner s = new Scanner(System.in);
        a = s.nextLong();
        b = s.nextLong();
        sum = 0L;
        if (a <= b) {
            while (a <= b) {
                if (a % 7 == 0) {
                    sum = sum + a;
                    a++;
                }else{
                    a++;
                }
            }
            System.out.println(sum);
        } else {
            while (b <= a) {
                if (b % 7 == 0) {
                    sum = sum + b;
                    b++;
                }else{
                    b++;
                }
            }
            System.out.println(sum);
        }

    }
}
