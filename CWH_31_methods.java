package com.company;

public class CWH_31_methods {
    static void tellJoke(){
        System.out.println("I invented a new word\n"+"Plagarism!");
    }
    static int logic(int x,int y){
        int z;
        if (x > y) {
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
        }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        c=logic(a,b);
        int a1=2;
        int b1=1;
        int c1;
        // Method invocation using object creation when the method is not static
        // CWH_31_methods obj=new CWH_31_methods();
        //c=obj.logic(a,b);
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
//        if (a > b) {
//            c=a+b;
//        }
//        else {
//            c=(a+b)*5;
//        }
//        int a1=2;
//        int b1=1;
//        int c1;
//        if (a1 > b1) {     //Repetition of logic use methods instead
//            c1=a1+b1;
//        }
//        else {
//            c1=(a1+b1)*5;
//        }
    }
}
