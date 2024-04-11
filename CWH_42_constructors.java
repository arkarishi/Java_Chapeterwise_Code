package com.company;
import java.util.Scanner;

//class MyMainEmployee{
//    private int id;
//    private String name;
//
//    public MyMainEmployee(String Myname){
//        id=45;
//        name=Myname;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        this.name=n;
//    }
//
//}
class Employee2{
    private int salary;
    public Employee2(int mysalary){
        salary=mysalary;
    }
    public int getSalary(){
        return salary;
    }
}
public class CWH_42_constructors {
    public static void main(String[] args) {
//        MyMainEmployee harry = new MyMainEmployee("codewithharry");
//        // harry.setName("CodeWithHarry");
//        System.out.println(harry.getName());
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        Employee2 rishi=new Employee2(a);
        System.out.println(rishi.getSalary());
    }
}
