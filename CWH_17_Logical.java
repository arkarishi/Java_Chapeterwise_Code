package com.company;

public class CWH_17_Logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");

        boolean a = true;
        boolean b = true;
        boolean c = true;

        if (a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical OR...");

        if (a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical OR...");

        if (!a){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
    }
}
