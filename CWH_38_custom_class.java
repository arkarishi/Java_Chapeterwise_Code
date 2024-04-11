package com.company;

class Employee1{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My name is "+id);
        System.out.println("and my name is "+name);
    }

    public int getSalary(){
        return salary;
    }
}
public class CWH_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harry= new Employee1();// Instantiating a new employee object
        Employee1 john= new Employee1();

        // Setting attributes for harry
        harry.id=12;
        harry.name="CODEWITHHARRY";
        harry.salary=34;

        // Setting attributes for john
        john.id=17;
        john.name="John Tripathi";
        john.salary=12;

        // Printing the attributes
        harry.printDetails();
        john.printDetails();
        int salary= john.salary;
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}
