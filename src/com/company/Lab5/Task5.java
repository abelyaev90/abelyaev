package com.company.Lab5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Double distanceInKm, distanceInFeet, distanceM1Km, distanceM2Feet;
        Scanner s  = new Scanner(System.in);
        distanceInKm = s.nextDouble();
        distanceInFeet = s.nextDouble();
        distanceM1Km = distanceInKm*1000;
        distanceM2Feet = distanceInFeet*0.305;
        if (distanceInFeet<0) {
            System.out.println("Значение distanceInFeet должно быть неотрицательным");
            return;
        }
        if (distanceInKm<0){
            System.out.println("Значение distanceInKm должно быть неотрицательным");
            return;
        }
        if (distanceM1Km<distanceM2Feet) {
            System.out.println("Расстояние в километрах меньше");
        }else {
            System.out.println("Расстояние в футах меньше");
        }
    }
}
