package com.company;

public class CWH_27_arrays {
    public static void main(String[] args) {
        // float [] marks={98.1f,45.7f,79.87f,90.01f,80.9f};
        // String [] students={"Harry","Rohan","Shubham","Lovish"};


        int [] marks={98,45,79,99,80};
        System.out.println(marks.length);


        // Displaying the Array (Naive Way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (For loop)
        for (int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // Displaying the Array in the reverse order
        for (int i=marks.length-1; i>=0;i--){
            System.out.println(marks[i]);
        }

        // Displaying the array (for-each loop)
        for(int element: marks){
            System.out.println(element);
        }

    }
}
