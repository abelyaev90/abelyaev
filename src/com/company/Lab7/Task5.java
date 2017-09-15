package com.company.Lab7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String str = "abcdefwxyz";
        int ca, cb;
        Scanner s = new Scanner(System.in);
        ca = s.nextInt();
        cb = s.nextInt()+1;
        if (ca>cb){
            System.out.println("Значение CA должно быть меньше CB");
            return;
        }
        if (ca<0 || ca>10){
            System.out.println("Значение CA должно быть в интервале [0,длина строки)");
            return;
        }
        if (cb<0 || cb>10){
            System.out.println("Значение CB должно быть в интервале [0,длина строки)");
            return;
        }
        System.out.println(str.substring(ca,cb));
    }
}
