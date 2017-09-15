package com.company.Lab7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String str = "abcdefwxyz";
        String x;
        Scanner s = new Scanner(System.in);
        x = s.nextLine();
        if (str.contains(x)){
            System.out.println("Содержится");
        }else{
            System.out.println("Не содержится");
        }
    }
}
