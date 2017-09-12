package com.company.Lab8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p;
        int q;
        int n;
        n = 0;
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
        if (p < q) {
            while (n <= arr.length) {
                if (n == p) {
                    int k = Integer.parseInt(arr[q]);
                    System.out.print(k + " ");
                    n++;
                }
                if (n == q) {
                    int l = Integer.parseInt(arr[p]);
                    System.out.print(l + " ");
                    n++;
                }
                int m = Integer.parseInt(arr[n]);
                System.out.print(m + " ");
                n++;
            }
        } else {
            while (n <= arr.length) {
                if (n == q) {
                    int k = Integer.parseInt(arr[p]);
                    System.out.print(k + " ");
                    n++;
                }
                if (n == p) {
                    int l = Integer.parseInt(arr[q]);
                    System.out.print(l + " ");
                    n++;
                }
                int m = Integer.parseInt(arr[n]);
                System.out.print(m + " ");
                n++;
            }

        }


    }
}
