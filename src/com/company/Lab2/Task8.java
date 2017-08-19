package com.company.Lab2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Integer totalInM, partInCm, totalInCM, izd;
        Scanner s = new Scanner(System.in);
        totalInM = s.nextInt();
        partInCm = s.nextInt();
        if (totalInM<=0 | partInCm<=0){
            if (totalInM<=0) {
                System.out.println("Значение totalInM должно быть положительным");
            }
            else{
                System.out.println("Значение partInCm должно быть положительным");
            }}
            else {
            totalInCM = totalInM*100;
            izd = totalInCM/partInCm;
            System.out.println(izd);


        }
    }
}
