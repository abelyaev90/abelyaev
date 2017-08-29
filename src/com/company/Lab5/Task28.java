package com.company.Lab5;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Double a, b, c, d;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = s.nextDouble();
        if (a<0){
            System.out.println("Значение A должно быть неотрицательным");
            return;
        }
        if (b<0){
            System.out.println("Значение B должно быть неотрицательным");
            return;
        }
        if (c<0){
            System.out.println("Значение C должно быть неотрицательным");
            return;
        }
        if (d<0){
            System.out.println("Значение D должно быть неотрицательным");
            return;
        }

        if (a<=c & b<=d){
            System.out.println("Размещение возможно");
        }else{
            System.out.println("Размещение невозможно");
        }

    }
}
