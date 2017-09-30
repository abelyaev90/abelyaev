package com.company.Lab5;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double xt, yt, xp1,yp1, xp2, yp2,x;
        xt = s.nextDouble();
        yt = s.nextDouble();
        xp1 = s.nextDouble();
        yp1 = s.nextDouble();
        xp2 = s.nextDouble();
        yp2 = s.nextDouble();
        if (xt<0){
            System.out.println("Координата X должна быть неотрицательной");
            return;
        }
        x = (xt-xp1)*(yp2-yp1)-(xp2-xp1)*(yt-yp1);
        if (x==0){
            System.out.println("Точка принадлежит прямой");
        }else{
            System.out.println("Точка не принадлежит прямой");
        }
    }
}
