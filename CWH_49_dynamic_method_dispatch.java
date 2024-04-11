package com.company;

class Phone {
    public void showTime(){
        System.out.println("Time is 8AM");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music");
    }
    public void on(){
        System.out.println("Turning on smartphone...");
    }
}
public class CWH_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj=new Phone();
//        SmartPhone smobj=new SmartPhone();
//        obj.name();
        Phone obj=new SmartPhone(); // superclass ref can be equal to subclass obj
        // SmartPhone obj1=new Phone();
        obj.showTime();
        obj.on();
        // obj.music();
    }
}
