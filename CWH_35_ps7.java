package com.company;
import java.util.Scanner;

public class CWH_35_ps7 {
    static void tables(int n){ // QUESTION 1
        for (int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
    static void pattern(int n){ // QUESTION 2
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    static int sum(int n){ // QUESTION 3
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    static void pattern2(int n){ // QUESTION 4
        for (int i=0;i<n;i++){
            for (int j=n-i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    static int fib(int n){ // QUESTION 8
        if(n==1){
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    static int avg(int ...arr){
        int result=0;
        for (int a:arr){
            result+=a;
        }
        return result/ arr.length;
    }
    static void pattern_rec (int n){

        if(n>0){
            pattern_rec(n-1);
            for (int i=0;i<n;i++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    static int sum_iterative(int n){
        if (n==1){
            return 1;
        }
        else {
            int sum=0;
            for (int i=1;i<=n;i++){// 1 to n
                sum +=i;
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        // QUESTION 1
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n=sc.nextInt();
//        tables(n);

        // QUESTION 2
//        pattern(4);

        // QUESTION 3
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the nth number: ");
//        int n= sc.nextInt();
//        System.out.println("Sum of "+n+" natural numbers: "+sum(n));

        // QUESTION 4
//        pattern2(4);

        // QUESTION 5
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the nth number: ");
//        int n= sc.nextInt();
//        int num=fib(n);
//        System.out.println("nth term of fib series: "+num);

        // QUESTION 6
//        System.out.println(avg(1,2,3,4,5,6));

        // QUESTION 8
//        pattern_rec(4);

        // QUESTION 10
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the nth number: ");
        int n= sc.nextInt();
        System.out.println("Sum of "+n+" natural numbers: "+sum(n));
    }
}
