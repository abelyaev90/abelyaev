package com.company.Lab5;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Double xт, yт, xп, yп, h, w, xп1, yп1;
        Scanner s = new Scanner(System.in);
        xт = s.nextDouble();
        yт = s.nextDouble();
        xп = s.nextDouble();
        yп = s.nextDouble();
        h = s.nextDouble();
        w = s.nextDouble();
        if (h <= 0) {
            System.out.println("Высота должна быть положительна");
            return;
        }
        if (w <= 0) {
            System.out.println("Ширина должна быть положительна");
            return;
        }
        if (yт < 0) {
            System.out.println("Координата Y должна быть неотрицательной");
            return;
        }
        xп1 = xп + w;
        yп1 = yп + h;
        if (xт >= xп & xт <= xп1 & yт >= yп & yт <= yп1) {
            System.out.println("точка внутри");
        } else {
            System.out.println("точка не внутри");
        }

    }
}
