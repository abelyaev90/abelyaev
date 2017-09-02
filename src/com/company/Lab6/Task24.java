package com.company.Lab6;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        int x,a;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        for (a=30; a<=40; a++){
            if (x==a){
                System.out.println(a + "+");
            }else{
                System.out.println(a + "-");
            }
        }
    }
}
