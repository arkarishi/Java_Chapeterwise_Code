package com.company;

public class CWH_26_arrays {
    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of 500 students
        You have 2 options:
        1. Create 500 Variables
        2. Use Arrays (Recommended)
         */
        // There are three ways to create an array in java
        //int [] marks={100,60,70,90,96}
        //int [] marks=new int[5];
        int [] marks;
        marks=new int[5];
        marks[0]=100;
        marks[1]=60;
        marks[2]=70;
        marks[3]=90;
        marks[4]=86;
        // marks[5]=96; - Throws an error
        System.out.println(marks[4]);


    }
}
