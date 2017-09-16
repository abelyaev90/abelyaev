package com.company.Lab7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String str = "abcdefwxyz";
        Scanner s = new Scanner(System.in);
        String ca,cb;
        int a,b,c,p,q;
        ca = s.nextLine();
        cb = s.nextLine();
        if (!str.contains(ca)){
            System.out.println("Значение CA отсутствует в строке");
            return;
        }if (!str.contains(cb)){
            System.out.println("Значение CB отсутствует в строке");
            return;
        }
        a = str.indexOf(ca);
        b = str.indexOf(cb);
        if (a>b){
            c = a-b-1;
            System.out.println(c);
        }else{
            c = b-a-1;
            System.out.println(c);
        }


    }
}
