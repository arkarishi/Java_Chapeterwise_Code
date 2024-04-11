package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends Parent2{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class CWH_52_abstract {
    public static void main(String[] args) {
        // Parent2 p=new Parent2(); --error
        child2 c=new child2();
        // child3 c1=new child3();  --error

    }
}
