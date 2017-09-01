package com.company.Lab6;

public class Task15 {
    public static void main(String[] args) {
        Integer b;
        Double a, sum, c;
        a = 20.D;
        b = 40;
        sum = 0.D;
        System.out.print("Ход решения:");
        while (a<=b){

            c = Math.pow(a,3);
            System.out.print(sum +" + " + c+ " = ");
            sum = sum + c;
            a++;
        }
        System.out.println("Ответ:"+ sum);
    }
}
