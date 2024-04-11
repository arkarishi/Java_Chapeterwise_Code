package com.company;

public class CWH_34_recurssion {
    // Factorial(n)=n*n-1*n-2...*1
    // factorial(5)=5*4*3*2*1=120
    // factorial(n)=n*factorial(n-1)
    static void fibonacci(int n){
        int firstterm=0, secondterm=1;
        System.out.println("The fibonacci series is: ");
        for (int i=1;i<=n;i++){
            System.out.print(firstterm+" , ");
            int nextterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=nextterm;
        }
    }
    static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if (n==0||n==1){
            return 1;
        }
        else {
            int product=1;
            for (int i=1;i<=n;i++){// 1 to n
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("The value of factorial of n is: "+factorial(n));
        System.out.println("The value of factorial of n is: "+factorial(n));
        fibonacci(n);
    // Fibonacci solved
    }
}
