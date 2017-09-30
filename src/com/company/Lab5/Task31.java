package com.company.Lab5;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double a1, b1, a2, b2;
        a1 = s.nextDouble();
        b1 = s.nextDouble();
        a2 = s.nextDouble();
        b2 = s.nextDouble();
        if (a1>b1 || a2>b2){
            System.out.println("Значение A должно быть меньше значения B");
            return;
        }
        if (b1< a2 || b2<a1){
            System.out.println("не пересекаются");
            return;
        }
        if (a2<b1 && b2>b1 && a1<a2){
            System.out.println("пересекаются ("+a2 +";"+b1+")");
            return;
        }
        if ( a1<b2 && b1>b2&& a2>a1){
            System.out.println("пересекаются ("+a2+";"+b2+")");
            return;
        }
        if (a2<a1 && b2<b1){
            System.out.println("пересекаются ("+a1+";"+b2+")");
            return;
        } if (a2<a1 && b1<b2){
            System.out.println("пересекаются ("+a1+";"+b1+")");
            return;
        }if (a1<a2 &&b2<b1){
            System.out.println("пересекаются ("+a2+";"+b2+")");
            return;
        }

    }
}
