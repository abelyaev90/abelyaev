package com.company.Lab6;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Integer b;
        Scanner s = new Scanner(System.in);
        b = s.nextInt();
        if (b<-10){
            System.out.println("Значение b должно быть в интервале [-10,10000]");
            return;
        }
        if (b>10000){
            System.out.println("Значение b должно быть в интервале [-10,10000]");
            return;
        }
        System.out.println((b*(b+1))/2 - ((-10-1)*((-10-1)+1))/2);//ЭТО МАГИЯ, я не знаю как, но это работает!
    }
}
