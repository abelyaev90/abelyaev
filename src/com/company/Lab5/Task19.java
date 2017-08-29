package com.company.Lab5;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Double x,y;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = s.nextDouble();
        if (x<-2 & y>1){
            System.out.println("точка находится внутри области");
            return;
        }
        if (x == -2 & y == 1){
            System.out.println("точка находится на пересичении границ");
            return;
        }
        if (x ==-2 & y > 1){
            System.out.println("точка находится на границе");
            return;
        }
        if (y == 1 & x < -2){
            System.out.println("точка находится на границе");
            return;
        }
        if (x >=-2 & y == 1){
            System.out.println("точка находится на границе");
            return;
        }
        if (y <= 1 & x == -2){
            System.out.println("точка находится на границе");
            return;
        }
        if (x>-2 & y >1){
            System.out.println("точка находится вне множества");
            return;
        }
        if (x>-2 & y<1){
            System.out.println("точка находится вне множества");
            return;
        }
        if (x<-2 & y <1){
            System.out.println("точка находится вне множества");
            return;
        }

    }
}
