package com.company;
import java.util.Scanner;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n) {
        name=n;
    }
}
class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
}
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
class circle{
    int radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2*3.14f*radius;
    }
}
public class CWH_39_ps8 {
    public static void main(String[] args) {
        // Problem 1
//        Employee rishi=new Employee();
//        rishi.setName("Rishi");
//        rishi.salary=20000;
//        System.out.println(rishi.getName());
//        System.out.println("Salary: "+rishi.getSalary());

        // Problem 2
//        cellphone ip=new cellphone();
//        ip.ringing();
//        ip.vibrating();

        // Problem 3
//        square sq= new square();
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Length of square: ");
//        sq.side=sc.nextInt();
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        // Problem 4
//        rectangle rc=new rectangle();
//        Scanner sc= new Scanner(System.in);
//        rc.length= sc.nextInt();
//        rc.breadth= sc.nextInt();
//        System.out.println(rc.area());
//        System.out.println(rc.perimeter());

        // Problem 6
        circle c=new circle();
        Scanner sc= new Scanner(System.in);
        c.radius= sc.nextInt();
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}
