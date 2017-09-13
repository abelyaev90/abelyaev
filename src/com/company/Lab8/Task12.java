package com.company.Lab8;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        String [] arr;
        int a;
        arr = new String[]{"a", "b","c","d", "e", "f", "g", "h"};
        String x;
        x = w.nextLine();
        for (a=0; a<8; a++){
            if (x.equals(arr[a])){
                System.out.println(arr[a] + "+");
            }else{
                System.out.println(arr[a]);
            }
        }

        /*String x, a;
        Scanner s = new Scanner(System.in);
        x = s.nextLine();
        if ("a".equals(x)){
            System.out.println("a+");
        }else{
            System.out.println("a");
        }
        if ("b".equals(x)){
            System.out.println("b+");
        }else
            System.out.println("b");
        if ("c".equals(x)){
            System.out.println("c+");
        }else
            System.out.println("c");
        if ("d".equals(x)){
            System.out.println("d+");
        }else
            System.out.println("d");
        if ("e".equals(x)){
            System.out.println("e+");
        }else
            System.out.println("e");
        if ("f".equals(x)){
            System.out.println("f+");
        }else
            System.out.println("f");
        if ("g".equals(x)){
            System.out.println("g+");
        }else
            System.out.println("g");
        if ("h".equals(x)){
            System.out.println("h+");
        }else
            System.out.println("h");
    */}
}


