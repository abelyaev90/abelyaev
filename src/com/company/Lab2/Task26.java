package com.company.Lab2;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Double a, b, c, d, r;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = s.nextDouble();
        if (a == 0 | d ==0){
            if (a==0) {
                System.out.println("Значение a должно быть не равно нулю");
            }else {
                System.out.println("Значение d должно быть не равно нулю");
            }
        }else{
            r = (a*d + b*c)/(a*d);
            System.out.printf("%8.4f", r);
        }
    }
}
