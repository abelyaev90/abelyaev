package com.company.Lab2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Double x,y,R,c;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = s.nextDouble();
        if (y<0) {
            System.out.println("Значение y должно быть неотрицательным");
        }else {
            c = x + Math.sqrt(y);
            if (c<0) {
                System.out.println("Подкоренное выражение должно быть неотрицательным");
            }else {
                R = -5 * Math.sqrt(c);
                System.out.printf("%8.4f", R);
            }
            }
        }
    }

