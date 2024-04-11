package com.company;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        System.out.println("I am an overloaded constructor with the value of a as: "+a);
    }
}
class Derived1 extends Base1{
    public int y;

    public Derived1() {
//        super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x,int b){
        super(x);
        System.out.println("I am a overloaded constructor of derived with value of b as: "+b);
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
class childofderived extends Derived1{
    childofderived(){
        System.out.println("I am a child of derived class");
    }
    childofderived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a overloaded constructor of derived with value of z as: "+z);
    }
}
public class CWH_46_constructors_in_inheritance {
    public static void main(String[] args) {
        // Base1 b=new Base1();
        // Derived1 a=new Derived1();
//        Derived1 a=new Derived1(14,5);
        childofderived cd=new childofderived(12,13,14);
    }
}
