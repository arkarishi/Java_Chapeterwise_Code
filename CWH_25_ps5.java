package com.company;
import java.util.Scanner;

public class CWH_25_ps5 {
    public static void main(String[] args) {

//        //Q1
//        for (int i=0;i<4;i++){
//            for (int j=4;j>i;j--){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//        //Q2
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=0;i<n;i++){
//            System.out.println(2*i);
//        }

//        //Q3
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        for(int i=0;i<=10;i++){
//            System.out.print(n+"*"+i+"=");
//            System.out.println(n*i);
//        }

//        //Q4
//        int n=10;
//        for (int i=10;i>=0;i--){
//            System.out.print(n+"*"+i+"=");
//            System.out.println(n*i);
//        }

//        //Q5
//        int product=1;
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        for (int i=n;i>=1;i--){
//            product=product*i;
//        }
//        System.out.println(product);

//        //Q9
//        int n=8;
//        int sum=0;
//        for (int i=0;i<=10;i++){
//            sum+=n*i;
//        }
//        System.out.println(sum);

        //Q11
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        while (i<n){
            System.out.println(2*i);
            i++;
        }

    }
}
