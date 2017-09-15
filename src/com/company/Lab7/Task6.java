package com.company.Lab7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String str = "abcdefwxyz";
        String ca, cb;
        int a, b;
        Scanner s = new Scanner(System.in);
        ca = s.nextLine();
        cb = s.nextLine();
        if (!str.contains(ca)) {
            System.out.println("Значение CA отсутствует в строке");
            return;
        }
        if (!str.contains(cb)) {
            System.out.println("Значение CB отсутствует в строке");
            return;
        }
        a = str.indexOf(ca);
        b = str.indexOf(cb);
        if (b > a) {
            System.out.println(str.substring(a+1, b));
        } else {
            System.out.println(str.substring(b+1, a));

        }
    }
}
