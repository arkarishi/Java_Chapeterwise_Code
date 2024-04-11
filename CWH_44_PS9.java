package com.company;
import java.util.Scanner;

class cylinder{
    private int radius;
    private int height;
    public void setRadius(int rad){
        radius=rad;
    }
    public void setHeight(int hei){
        height=hei;
    }
    public int getRadius(){
        return radius;
    }
    public int setHeight(){
        return height;
    }
    public double getSa(){
        return Math.PI*2*radius*height;
    }
    public double getVol(){
        return Math.PI*radius*radius*height;
    }
}
class cylinder1{
    private int radius;
    private int height;
    public cylinder1(int r,int h){
        radius=r;
        height=h;
    }
    public int getRadius(){
        return radius;
    }
    public int setHeight(){
        return height;
    }
}
class Rectangle1{
    private int length;
    private int breadth;

    public Rectangle1(int breadth,int length) {
        this.breadth = breadth;
        this.length = length;
    }

    public Rectangle1() {
        this.breadth = 5;
        this.length = 4;
    }
    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
}

public class CWH_44_PS9 {
    public static void main(String[] args) {
        // Q1
        cylinder cy1=new cylinder();
        Scanner sc=new Scanner(System.in);
        System.out.println("Set radius of cylinder: ");
        int a = sc.nextInt();
        System.out.println("Set height of cylinder: ");
        int b= sc.nextInt();
        cy1.setRadius(a);
        cy1.setHeight(b);
        System.out.println("The radius of cylinder: "+cy1.getRadius());
        System.out.println("The height of cylinder: "+cy1.setHeight());

        // Q2
        System.out.println("The sa of cylinder: "+cy1.getSa());
        System.out.println("The sa of cylinder: "+cy1.getVol());

        // Q3
        int a1= sc.nextInt();
        int b1= sc.nextInt();
        cylinder1 cy2=new cylinder1(a1,b1);
        System.out.println("The radius of cylinder: "+cy2.getRadius());
        System.out.println("The height of cylinder: "+cy2.setHeight());

        // Q4
        Rectangle1 rc=new Rectangle1();
        System.out.println("Length: "+rc.getLength());
        System.out.println("Breadth: "+rc.getBreadth());
    }

}
