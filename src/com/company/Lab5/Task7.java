package com.company.Lab5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Double radius, edge, Scrug, Sqadrat;
        Scanner s = new Scanner(System.in);
        radius = s.nextDouble();
        edge = s.nextDouble();
        if (radius<0){
            System.out.println("Радиус должен быть положительным");
        return;}
        if (edge<0){
            System.out.println("Сторона квадрата должна быть положительна");
        return;}
        Scrug = (Math.PI)*radius*radius;
        Sqadrat = edge*edge;
        if (Sqadrat>Scrug){
            System.out.print("Площадь квадрата ");
            System.out.printf("%8.4f",Sqadrat);
            System.out.print(" больше площади круга ");
            System.out.printf("%8.4f", Scrug);
        }else{
            System.out.print("Площадь круга ");
            System.out.printf("%8.4f",Scrug);
            System.out.print(" больше площади квадрата ");
            System.out.printf("%8.4f", Sqadrat);

        }
    }
}
