package com.company.Lab6;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Long a,b, kv;
        Scanner s = new Scanner(System.in);
        a = s.nextLong();
        b = s.nextLong();
        kv = 0L;
        if (a<=b){
            while (a<=b){
                kv = kv + a*a;
                a++;
            }
            System.out.println(kv);
        }else{
            while (b<=a){
                kv = kv+b*b;
                b++;
            }
            System.out.println(kv);
        }
    }
}
