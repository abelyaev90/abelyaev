package com.company.Lab8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer b, e, p, q;
        String str = s.nextLine();
        String[] arr = str.split(" ");
        p = 0;
        q = 0;
        b = s.nextInt();
        e = s.nextInt();
        if (b < 0 || b > arr.length-1) {
            System.out.println("Число B должно быть в интервале [0, размер массива)");
            return;
        }
        if (e < 0 || e > arr.length-1) {
            System.out.println("Число E должно быть в интервале [0, размер массива)");
            return;
        }
        if (b <= e) {
            while (b <= e) {
                int n = Integer.parseInt(arr[b]);
                System.out.print(n + " ");
                b++;}
            }else{
                while (e < b) {
                    int n = Integer.parseInt(arr[e]);
                    System.out.print(n + " ");
                    e++;
                }

            }

        }

    }