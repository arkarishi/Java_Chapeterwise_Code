package com.company;

public class CWH_10_Ch2_resulting_data_type {
    public static void main(String[] args) {
        byte x=5;
        int y=6;
        short z=8;
        int a=y+z;
        float b=6.54f+x;
        System.out.println(b);

        //Increment and Decrement Operators
        int i=56;
        //   int b=i++; // First b is assigned i (56) then i is incremented
        int j=67;
        int c=++j; // First j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        // Q1
        int y1=7;
        System.out.println(++y1*8);
        // Q2
        char a1='B';
        System.out.println(++a1);
    }
}
