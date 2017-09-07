package com.company.Lab8;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Integer n,a;
        n = 0;
        a = 0;
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String [] arr = str.split(" ");
        while (n<arr.length){
            System.out.print(arr[a]+ " ");
            System.out.println(a);
            n++;
            a++;
        }
    }
}
