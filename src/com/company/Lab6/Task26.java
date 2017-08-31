package com.company.Lab6;

public class Task26 {
    public static void main(String[] args) {
        int x,n;
        n=0;
        System.out.print("Ход решения:");
        for (x=100; x<=1000;x++){
            if (x%13==0){
                System.out.print(x+" +");
                n++;
            }
            System.out.print(x+" ");
        }System.out.print("\n"+"Ответ:"+n);
    }
}
