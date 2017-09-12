package com.company.Lab8;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String arr[] = str.split(" ");
        int n;
        int m;
        m=0;
        while (m<=arr.length-1){
            int a = Integer.parseInt(arr[m]);
            m++;
            System.out.print(a + " ");
        }

    }
}
