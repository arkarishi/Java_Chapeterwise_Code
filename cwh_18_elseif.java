package com.company;
import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        int age=56;
        System.out.println("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        switch (age){
            case 18:
                System.out.println(("You are going to become adult!"));
                break;
            case 21:
                System.out.println("You are going to get a job!");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks fro using my java code!");

        /*
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if (age>46) {
            System.out.println("You are semi-experienced!");
        }
        else if (age>36) {
            System.out.println("You are semi-experienced!");
        }
        else {
            System.out.println("You are not experienced!");
        }
        */
    }
}
