package com.company.Lab5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Double K, X;
        Scanner s = new Scanner(System.in);
        K = s.nextDouble();
        if (K>0){
            X = Math.sqrt(K);
            System.out.println(X);
        }else{
            X = K*K;
            System.out.println(X);
        }

    }
}
