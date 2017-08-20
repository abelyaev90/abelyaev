package com.company.Lab2;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Double initialVelocity, time, acceleration, distance;
        Scanner s = new Scanner(System.in);
        initialVelocity = s.nextDouble();
        time = s.nextDouble();
        acceleration = s.nextDouble();
        if (time <= 0 | initialVelocity < 0) {
            if (time <= 0) {
                System.out.println("Время должно быть положительным");
            } else {
                System.out.println("Начальная скорость должно быть неотрицательна");
            }
        } else {
            distance = initialVelocity * time + (acceleration * Math.pow(time, 2)) / 2;
            System.out.printf("%8.2f", distance);
        }
    }
}
