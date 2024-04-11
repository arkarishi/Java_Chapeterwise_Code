package com.company;
import java.util.Scanner;
public class CWH_23_CH4_for_loop {
    public static void main(String[] args) {
        for (int i=0 ; i<=10 ; i++)
        {
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many natural odd numbers are needed to be inserted: ");
        int n = sc.nextInt();
        for (int j=0  ; j!=n ; j++){
            System.out.println(2*j+1);
        }

        for (int k =5 ;k>=0;k--){
            System.out.println(k);
        }
    }
}
