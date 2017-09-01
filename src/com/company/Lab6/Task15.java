package com.company.Lab6;

public class Task15 {
    public static void main(String[] args) {
        int a,sum;
        System.out.print("Ход решения: ");
        a=20;
        sum =0;
        while (a<=40){

            System.out.print(Math.pow(a,3));
            a++;
            System.out.print("+" + Math.pow(a,3)+ " = ");

        }
        System.out.print("\nОтвет: " + sum);
    }
}
