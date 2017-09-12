package com.company.Lab8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m;
        int a;
        String str = s.nextLine();
        String arr[] = str.split(" ");
        m = s.nextInt();
        a = arr.length-1;
        while (a>=0){
            int n = Integer.parseInt(arr[a]);
            System.out.print(n * m + " ");
            a--;
        }
    }
}
