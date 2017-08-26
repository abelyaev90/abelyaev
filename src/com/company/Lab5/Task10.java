package com.company.Lab5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Double x, y, z, x1, y1, z1;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        if (x>0){
            x1 = x*x;
            System.out.print(x1+";");
            return;}
            if (y>0){
            y1 = y*y;
                System.out.print(y1+";");
                return;}
                if (z>0){
                z1 = z*z;
                    System.out.print(z1+";");
                    return;
        }
        System.out.println(x+";"+y+";"+z);

    }
}
