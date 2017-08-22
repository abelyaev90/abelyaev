package com.company.Lab2;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Double volume1, volume2, temperature1, temperature2, temperature, volume;
        Scanner s = new Scanner(System.in);
        volume1 = s.nextDouble();
        temperature1 = s.nextDouble();
        volume2 = s.nextDouble();
        temperature2 = s.nextDouble();
        if (volume1<0 | volume2<0) {
            System.out.println("Объем должен быть неотрицательным");
        }else{
            volume = volume1+volume2;
            temperature = (temperature1*volume1+temperature2*volume2)/volume;
            System.out.println(volume);
            System.out.printf("%8.4f",temperature);
        }
    }
}
