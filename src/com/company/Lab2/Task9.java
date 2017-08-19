package com.company.Lab2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Double aInitial, aRemainder;
        Scanner s= new Scanner(System.in);
        aInitial = s.nextDouble();
        aRemainder = aInitial%360;
        System.out.printf("%8.0f",aRemainder);
    }
}
