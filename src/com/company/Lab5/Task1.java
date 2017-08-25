package com.company.Lab5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Integer A, B;
        Scanner s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();
        if (A<B){
            System.out.println("Второе");
        }else{
            System.out.println("Первое");
        }
    }
}
