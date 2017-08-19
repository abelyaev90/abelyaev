package com.company.Lab2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Double base, height;
        Double area;
        Scanner s = new Scanner(System.in);
        base = s.nextDouble();
        height = s.nextDouble();
        if (base <= 0 | height <= 0) {
            if (height <= 0) {
                System.out.println("Значение height должно быть положительным");
            } else {
                System.out.println("Значение base должно быть положительным");
            }}
            else{
                area = (base * height) / 2;
                System.out.printf("%8.2f", area);
            }

        }
    }

