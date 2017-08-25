package com.company.Lab5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Integer P, Q;
        Scanner s = new Scanner(System.in);
        P = s.nextInt();
        Q = s.nextInt();
        if (P<Q){
            System.out.println("Максимальное " + Q + ", минимальное" + P);
        }else{
            System.out.println("Максимальное " + P + ", минимальное" + Q);
        }

    }
}
