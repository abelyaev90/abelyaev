package com.company.Lab5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Double velocityInKmH, velocityInMS, velocityInMSvKmH;
        Scanner s = new Scanner(System.in);
        velocityInKmH = s.nextDouble();
        velocityInMS = s.nextDouble();
        if (velocityInKmH<0) {
            System.out.println("Значение velocityInKmH должно быть неотрицательным");
            return;
        }
        if (velocityInMS<0){
            System.out.println("Значение velocityInMS должно быть неотрицательным");
            return;
        }
        velocityInMSvKmH = velocityInMS*3.6;
        if (velocityInKmH<velocityInMSvKmH) {
            System.out.println(velocityInKmH + " км/ч меньше " + velocityInMS + " м/с");
        }else{
            System.out.println(velocityInMS + " м/с меньше " + velocityInKmH + "км/ч");
        }
    }
}
