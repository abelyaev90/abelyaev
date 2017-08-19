package com.company.Lab2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Double temperatureInC, temperatureInF;
        Scanner s = new Scanner(System.in);
        temperatureInC = s.nextDouble();
        if (temperatureInC<-273.15)
        {
            System.out.println("Температура должна быть выше абсолютного нуля");
        }
            else {
            temperatureInF = (temperatureInC * 1.8) + 32;
            System.out.printf("%8.4f", temperatureInF);
        }


    }
}
