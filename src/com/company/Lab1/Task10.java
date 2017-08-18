package com.company.Lab1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Integer x;
        Integer  y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        System.out.println("SINSERT INTO points (x, y) VALUES ( " + "'"+ x+ "'"+ ", " + "'" + y + "')"  + ";");


    }
}
