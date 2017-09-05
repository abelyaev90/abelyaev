package com.company.Lab6;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        String s;
        Integer h,n,c;
        Scanner a = new Scanner(System.in);
        s = a.nextLine();
        h = a.nextInt();
        n=0;
        if (h<0){
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }
        for (c=1;c<=h;c++) {
            while (n < c) {
                System.out.print(s);
                n++;
            }
            System.out.println(" ");
            n = 0;
        }

    }
}
