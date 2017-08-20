package com.company.Lab2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Double velocity1, velocity2, distance, time;
        Scanner s = new Scanner(System.in);
        velocity1 = s.nextDouble();
        velocity2 = s.nextDouble();
        distance = s.nextDouble();
        if (velocity1<0 | velocity2<0) {
            System.out.println("Скорость должна быть неотрицательна");
        }else{
            time = distance/(velocity1+velocity2);
            System.out.printf("%8.4f", time);
        }
    }
}
