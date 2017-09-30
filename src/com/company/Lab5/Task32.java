package com.company.Lab5;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double x1, y1, h1, w1, x2, y2, h2, w2;
        x1 = s.nextDouble();
        y1 = s.nextDouble();
        h1 = s.nextDouble();
        w1 = s.nextDouble();
        x2 = s.nextDouble();
        y2 = s.nextDouble();
        h2 = s.nextDouble();
        w2 = s.nextDouble();
        if (h1<=0 || h2<=0){
            System.out.println("Высота должна быть положительна");
            return;
        }

    }
}
