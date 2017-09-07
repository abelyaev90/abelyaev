package com.company.Lab8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String [] arr = str.split(" ");
        int a = 0;
        int sum = 0;
        while (a<=arr.length-1){
            int n = Integer.parseInt(arr[a]);
            sum = sum + n;
            a++;
        }
        Double arf = (double)sum/(arr.length);
        System.out.println(arf);
    }
}
