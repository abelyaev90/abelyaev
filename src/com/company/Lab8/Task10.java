package com.company.Lab8;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        String str = w.nextLine();
        String arr[] = str.split(" ");
        int a = 0;
        int s;
        int z = 0;
        s = w.nextInt();
        int b = arr.length-1;

        while (z<s) {
            String q = arr[b];
            while (b > 0) {
                arr[b] = arr[b - 1];
                b--;
            }
            z++;
            b = arr.length-1;
            arr[0] = q;
        }

        while (a<arr.length){
            System.out.print(arr[a] +" ");
            a++;
        }


    }
}
