package com.company;
class circle1{
    public int radius;
    public circle1(int r) {
        System.out.println("I am a circle parameterised constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder2 extends circle1{
    public int height;
    public cylinder2(int r,int h) {
        super(r);
        System.out.println("I am a cylinder parameterised constructor");
        this.height=h;
    }
}
public class CWH_51_PS10 {
    public static void main(String[] args) {
        // Problem 1
        cylinder2 obj=new cylinder2(12,4);
    }
}
