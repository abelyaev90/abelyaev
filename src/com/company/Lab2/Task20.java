package com.company.Lab2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Double mass, velocity, height, kineticEnergy, potentialEnergy, g;
        Scanner s = new Scanner(System.in);
        mass = s.nextDouble();
        velocity = s.nextDouble();
        height = s.nextDouble();
        g = 9.8067;
        if (mass<0|velocity<0|height<0){
            if (mass<0) {
                System.out.println("Значение mass должно быть положительным");
            }else{
                if (velocity<0) {
                    System.out.println("Значение velocity должно быть положительным");
                }else{ System.out.println("Значение height должно быть неотрицательным");
                }
                }
            }else{
            kineticEnergy = (mass*Math.pow(velocity,2))/2;
            potentialEnergy = mass*g*height;
            System.out.printf("Кинетическая энергия составляет: " + "%8.4f",kineticEnergy);
            System.out.println(" Дж");
            System.out.printf("Потенциальная энергия составляет: " + "%8.4f",potentialEnergy);
            System.out.println(" Дж");

        }
    }
}
