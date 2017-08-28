package com.company.Lab5;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Integer x, y, z;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        if (x>y & x>z){
            System.out.println(x);
            return;
        }
        if (y>x & y>z){
            System.out.println(y);
            return;
        }
        if (z>x & z>y){
            System.out.println(z);
        }
    }
}
