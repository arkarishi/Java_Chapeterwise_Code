package com.company;
import java.util.Scanner;

public class CWH_18_ch4_ps {
    public static void main(String[] args) {

//        //Q1
//        int a=11;
//        if (a==11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }
//
//        //Q2
//        int sub1,sub2,sub3;
//        System.out.println("Enter the marks of sub1,sub2,sub3:");
//        Scanner sc=new Scanner(System.in);
//        sub1=sc.nextInt();
//        sub2=sc.nextInt();
//        sub3= sc.nextInt();
//        float avg=(sub1+sub2+sub3)/3.0f;
//        if (avg>40){
//            if (sub1>33 && sub2>33 && sub3>33 ){
//                System.out.println("Pass");
//            }
//            else {
//                System.out.println("Fail");
//            }
//        }
//        else {
//            System.out.println("Fail");
//        }

//        //Q3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income: ");
//
//        float income=sc.nextFloat();
//        float tax=0
//        if(income<=2.5){
//            tax=tax+0;
//        }
//        else if (income>2.5f && income<=5f){
//            tax =tax +0.05f *(income-2.5f);
//        }
//        else if (income>5f && income<=10f){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.05f * (income-2.5f);
//        }
//        else if (income>10.0f){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.05f * (10.0f-5f);
//            tax = tax + 0.05f * (income-10.0f);
//        }

//        //Q4
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");


        //Q6
        Scanner sc= new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("This is an organisational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is an commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }


    }
}
