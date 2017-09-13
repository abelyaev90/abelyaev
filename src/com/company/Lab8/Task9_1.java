package com.company.Lab8;

import java.util.Scanner;

public class Task9_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String arr[] = str.split(" ");
        int a = 0;
        int b = arr.length-1;
        String q = arr[b];
        while (b>0){
            arr[b] = arr[b-1];
            b--;
        }
        /*arr[5] = arr[4];
        arr[4] = arr[3];
        arr[3] = arr[2];
        arr[2] = arr[1];
        arr[1] = arr[0];*/
        arr[0] = q;
        while (a<arr.length){
            System.out.print(arr[a]+" ");
            a++;
        }

    }
}
