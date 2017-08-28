package com.company.Lab5;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Double x,m ,p, x1;
        Scanner s = new Scanner(System.in);
        m = s.nextDouble();
        p = s.nextDouble();
        if (p==0){
            System.out.println("Значение P должно быть не равно нулю");
            return;
        }
        x = m%p;
        x1 = m/p;
        if (x.equals(0.00)){
            System.out.println(x1);
        }else{
            System.out.println("M не делится нацело на P");
        }



    }
}
