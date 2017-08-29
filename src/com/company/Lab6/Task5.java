package com.company.Lab6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Integer a,x;
        String b;
        Scanner s = new Scanner(System.in);
        b = s.nextLine();
        a = s.nextInt();

        if (a<0){
            System.out.println("Значение A должно быть неотрицательным");
            return;
        }
        x=1;
        System.out.print("\"");
        while (x<=a){
            System.out.print(b);
            x++;
        }
        System.out.print("\"");
    }
}
