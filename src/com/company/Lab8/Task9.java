package com.company.Lab8;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String arr[] = str.split(" ");
        int x;
        x = 0;
      int a;
        a = arr.length-1;
        int n = Integer.parseInt(arr[a]);
        System.out.print(n +" ");
        while (x<a) {
            int m = Integer.parseInt(arr[x]);
            System.out.print(m +" ");
            x++;
        }
    }
}
