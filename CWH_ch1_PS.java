package com.company;
import java.util.Scanner;

public class CWH_ch1_PS {
    public static void main(String[] args) {
        System.out.println("EXECUTING PROGRAM NO 1");
        int a= 24;
        int b= 21;
        int c= 10;
        int sum=a+b+c;
        System.out.println(sum);

        System.out.println("EXECUTING PROGRAM NO 2");
        float a1=45;
        float b1=95;
        float c1=48;
        float cgpa=(a1+b1+c1)/30;
        System.out.println(cgpa);

        System.out.println("EXECUTING PROGRAM NO 3");
        Scanner sc= new Scanner(System.in);
        String name= sc.next();
        System.out.println("Hello "+name+",have a good day");

        System.out.println("EXECUTING PROGRAM NO 4");
        float kms= 16.4f;
        float miles=0.62f*kms;
        System.out.println(miles);

        System.out.println("EXECUTING PROGRAM NO 5");
        System.out.println(sc.hasNextInt());
    }
}
