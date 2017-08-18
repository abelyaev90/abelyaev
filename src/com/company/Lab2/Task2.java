package com.company.Lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Integer edge, area;
        Scanner s = new Scanner(System.in);
        edge = s.nextInt();
        if (edge <= 0) {
            System.out.println("Значение edge должно быть положительным");
        } else {
            area = 6 * (edge * edge);
            System.out.println(area);
        }

    }
}
