package com.company.Lab5;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Integer a, sotni, ed;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if (a<1000 || a>9999){
            System.out.println("Значение A должно быть в интервале [1000, 9999]");
            return;
        }
        sotni = (a/100)%10;
        ed = a%10;
        if (sotni.equals(ed)) {
            System.out.println("равно");
        }else{
            System.out.println("не равно");
        }

    }
}
