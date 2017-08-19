package com.company.Lab2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Integer radius;
        Double volume;
        Scanner s = new Scanner(System.in);
        radius = s.nextInt();
        if (radius<=0){
            System.out.println("Значение radius должно быть положительным");
        }
        else{
        volume = (4*Math.PI*Math.pow(radius,3))/3;
        System.out.printf("%8.4f",volume);}
    }
}
