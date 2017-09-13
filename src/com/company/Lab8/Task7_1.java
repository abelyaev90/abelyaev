package com.company.Lab8;

import java.util.Scanner;

public class Task7_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p;
        int q;
        int a;
        a=0;
        String cup;
        String str = s.nextLine();
        String[] arr = str.split(" ");
        p = s.nextInt();
        q = s.nextInt();
        if (p < 0 || p > arr.length - 1) {
            System.out.println("Число P должно быть в интервале [0, размер массива)");
            return;
        }
        if (q < 0 || q > arr.length - 1) {
            System.out.println("Число Q должно быть в интервале [0, размер массива)");
            return;
        }

        cup = arr[p];
        arr[p] = arr[q];
        arr[q] = cup;
        while (a<arr.length){
            System.out.print(arr[a] + " ");
            a++;
        }
    }
}
