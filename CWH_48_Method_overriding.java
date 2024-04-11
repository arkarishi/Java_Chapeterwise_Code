package com.company;

class A1{
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B1 extends A1{
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class A");
    }
}
public class CWH_48_Method_overriding {
    public static void main(String[] args) {
        A1 a=new A1();
        a.meth2();

        B1 b=new B1();
        b.meth2();
    }
}
