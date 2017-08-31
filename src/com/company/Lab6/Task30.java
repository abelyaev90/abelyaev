package com.company.Lab6;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w,n;
        n=0;
        w = s.nextInt();
        if (w<0||w>20){
            System.out.println("Значение W должно быть в интервале [0, 20]");
            return;
        }
        while (n<w){
            System.out.print("a");
            n++;
        }
    }
}
