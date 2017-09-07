package com.company.Lab8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Integer a;
        String str;
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        a = s.nextInt();
        String [] arr = str.split(" ");
        if (a<0 || a>arr.length){
            System.out.println("Число A должно быть в интервале [0, размер массива)");
            return;
        }
        if (str.equals("")){
            System.out.println("Исходная строка пуста");
            return;
        }
        System.out.println(arr[a]);
    }
}
