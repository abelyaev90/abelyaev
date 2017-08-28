package com.company.Lab5;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
       Double x,y,z, a, b;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        a = -3.00;
        b = 5.00;

        if (x>a & x<b) {
            System.out.print(x);
            System.out.print(" ");
        }else{
            System.out.print(" ");
        }
        if (y>=a & y<b) {
            System.out.print(y);
            System.out.print(" ");
        }else{
            System.out.print(" ");
        }
        if (z>a & z<b) {
            System.out.print(z);
            System.out.print(" ");
        }else{
            System.out.print(" ");
        }

    }
}
