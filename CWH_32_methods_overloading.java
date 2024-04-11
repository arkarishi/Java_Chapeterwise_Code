package com.company;

public class CWH_32_methods_overloading {
    static void tellJoke(){
        System.out.println("I invented a new word\n"+"Plagarism!");
    }
    static  void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+" Bro!");
    }
    static void foo(int a,int b){ // a and b are parameters
        System.out.println("Good Morning "+a+" Bro!");
        System.out.println("Good Morning "+b+" Bro!");
    }
    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0]=98;
    }


    public static void main(String[] args) {
        // tellJoke();
//        Case 1: Changing the integer
//        int x=45;
//        change(x);
//        System.out.println("The value of x after running change is: "+x);

        // Case2 : Changing the array
//        int [] marks={52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("The value of x after the change is: "+marks[0]);
        // The ref is passed of the previously made object so the change is permanent


        //   Method Overloading
        foo();
        foo(3000); // 3000 is a argument (assigning value)
        foo(3000,4000);
        // Arguments are actual
    }
}
