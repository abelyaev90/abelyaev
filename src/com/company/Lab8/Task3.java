package com.company.Lab8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Integer n,a;
        n = 1;
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String [] arr = str.split(" ");
        a = arr.length-1;
        while (n<=arr.length) {
            System.out.print(arr[a] + " ");
            a--;
            n++;
        }
        /*System.out.println(arr[a] + " " + a);
        a--;
        System.out.println(arr[a] + " " + a);
        a--;
        System.out.println(arr[a] + " " + a);
        a--;
        System.out.println(arr[a] + " " + a);
      /*
        while (n<arr.length-1){
            System.out.print(a+" ");
            n++;
            a--;
        }
*/
    }
}
