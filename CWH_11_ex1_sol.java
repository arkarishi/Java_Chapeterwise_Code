package com.company;
import java.util.Scanner;

public class CWH_11_ex1_sol {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Physics marks: ");
        int phy=sc.nextInt();
        System.out.println("Enter Your English marks: ");
        int eng=sc.nextInt();
        System.out.println("Enter Your Chemistry marks: ");
        int chem=sc.nextInt();
        System.out.println("Enter Your Maths marks: ");
        int math=sc.nextInt();
        System.out.println("Enter Your CS marks: ");
        int cs=sc.nextInt();

        float percentage=((phy+eng+chem+math+cs)/500.0f)*100;

        System.out.print("Percentage: ");
        System.out.println(percentage);

    }
}
