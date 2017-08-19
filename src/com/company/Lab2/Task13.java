package com.company.Lab2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Integer x;
        Double resuit;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        if (x > 61) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        } else {
            resuit = 3 * Math.sqrt((61 - x));
            System.out.printf("%8.4f", resuit);
        }

    }
}
