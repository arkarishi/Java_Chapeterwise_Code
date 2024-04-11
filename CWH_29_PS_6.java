package com.company;
import java.util.Scanner;

public class CWH_29_PS_6 {
    public static void main(String[] args) {
//        // Problem 1
//        float [] marks ={45.7f,67.8f,63.4f,99.2f,100.0f};
//        float sum = 0;
//        for (float element:marks){
//            sum+=element;
//        }
//        System.out.println("The value of sum is "+ sum);

//        // Problem 2
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int [] marks= new int[n];
//        boolean isInArray=false;
//        for (int i=0;i<n;i++){
//            marks[i]= sc.nextInt();
//        }
//        int num= sc.nextInt();
//        for (int j=0;j<5;j++){
//            if (marks[j]==num){
//                isInArray=true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("The value is present in the array");
//        }
//        else {
//            System.out.println("The value is present in array");
//        }

//        // Problem 3
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        float [] marks= new float[n];
//        for (int i=0;i<n;i++){
//            marks[i]= sc.nextFloat();
//        }
//        float sum = 0;
//        for (float element:marks){
//            sum+=element;
//        }
//        System.out.println("The value of avg is "+ sum/ marks.length);

//        // Problem 4
//        Scanner sc=new Scanner(System.in);
//        int [] [] marks= new int[2][3];
//        int [] [] marks1= new int[2][3];
//        int [] [] result=new int[2][3];
//        System.out.println("Elements of 1st Mat:");
//        for (int i=0;i<2;i++){
//            for (int j=0;j<3;j++){
//                marks[i][j]= sc.nextInt();
//            }
//        }
//        System.out.println("Elements of 2nd Mat:");
//        for (int i=0;i<2;i++){
//            for (int j=0;j<3;j++){
//                marks[i][j]= sc.nextInt();
//            }
//        }
//        System.out.println("Addition of two matrices ");
//        for (int i=0;i<2;i++){
//            for (int j=0;j<3;j++){
//                result[i][j]= marks[i][j]+marks1[i][j];
//            }
//        }
//        System.out.println(result[0][0]+" "+result[0][1]+" "+result[0][2]);
//        System.out.println(result[1][0]+" "+result[1][1]+" "+result[1][2]);


//        // Problem 5
//        int [] arr={1,2,3,4,5,6,7};
//        int l= arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for (int i=0;i<n;i++){
//            // Swap a[i] and a[l-1-i]
//            temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//        for (int element:arr){
//            System.out.print(element + " ");
//
//        }


//        // Problem 6
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int [] marks= new int[n];
//        for (int i=0;i<n;i++){
//            marks[i]= sc.nextInt();
//        }
//        int max=0;
//        for (int j=0;j<n;j++){
//            if(marks[j]>max){
//                max=marks[j];
//            }
//        }
//        System.out.println("Largest number of array: "+max );

//        // Problem 7
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int [] marks= new int[n];
//        for (int i=0;i<n;i++){
//            marks[i]= sc.nextInt();
//        }
//        int max=marks[0];
//        for (int j=0;j<n;j++){
//            if(marks[j]<max){
//                max=marks[j];
//            }
//        }
//        System.out.println("Largest number of array: "+max );


        // Problem 8
        boolean isSorted=true;
        int [] arr={1,212,23,556,5};
        for(int i=0;i< arr.length-1;i++){
            isSorted=false;
            break;
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The arrays is not sorted");
        }
    }
}
