package com.company.Lab6;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Integer a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if (a < -100) {
            System.out.println("Значение A должно быть в интервале [-100, 500]");
            return;
        }
        if (a > 500) {
            System.out.println("Значение A должно быть в интервале [-100, 500]");
            return;
        }
        System.out.println((500*(500+1))/2 - ((a-1)*((a-1)+1))/2);//ЭТО МАГИЯ, я не знаю как, но это работает!
    }
}

