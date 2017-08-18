package com.company.Lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Integer edge, volume;
        Scanner s = new Scanner(System.in);
        edge = s.nextInt();
        if (edge <= 0) {
            System.out.println("Значение edge должно быть положительным");
        } else {
            volume = (int)Math.pow(edge,3);
            System.out.println(volume);
        }

    }
}
