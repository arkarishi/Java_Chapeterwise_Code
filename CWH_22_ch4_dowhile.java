package com.company;
import java.util.Scanner;

public class CWH_22_ch4_dowhile {
    public static void main(String[] args) {
        int a=0;
        while(a<5){
            System.out.println(a);
            a++;
        }
        int b = 10;
        do {                             //enters without checking
            System.out.println(b);
            b++;
        }while (a<5);

        Scanner sc=new Scanner(System.in);
//        int a=1;
//        int n=sc.nextInt();
//
//        do {
//            System.out.println(a);
//            a++;
//        }while (a<=n);


    }
}
