package com.company.Lab7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String str = "abcdacadbacdaabaadc";
        Scanner s = new Scanner(System.in);
        String a;
        a = s.nextLine();
        int n;
        n = str.indexOf(a);
        System.out.println(n);
    }
}
