package com.company.Lab8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        String str = s.nextLine();
        String [] left = str.split(" ");
        String str2 = s.nextLine();
        String [] right = str2.split(" ");
        if (left.length != right.length ){
            System.out.println("Размеры массивов должны быть одинаковы");
            return;
        }
        while (a<=left.length-1){
            int n = Integer.parseInt(left[a]);
            int m = Integer.parseInt(right[a]);
            System.out.print(n*m + " ");
            a++;
        }

    }
}
