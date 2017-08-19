package com.company.Lab1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        String a;
        String  b;
        String c;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        a = s.nextLine();
        System.out.println("Введите вашу фамиию:");
        b = s.nextLine();
        System.out.println("Введите ID вашей группы:");
        c = s.nextLine();
        System.out.println("SELECT " + a+ "," + b + "," + "group FROM students WHERE student_id = " + "'"+c+"'" + ";");


    }

}



