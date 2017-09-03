package com.company.Lab6;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Integer y, b;
        Scanner s = new Scanner(System.in);
        y = s.nextInt();
        b = 2;
        if (y < 0) {
            System.out.println("Значение Y должно быть положительным");
            return;
        }
        if (y == 1) {
            System.out.println("число не простое");
            return;
        }
        while (b<y)
        if (y%b ==0){
            b++;
            System.out.println("число не простое");
        }else{
            System.out.println("число простое");
        }
    }
}

