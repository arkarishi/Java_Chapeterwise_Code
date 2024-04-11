package com.company;

interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedup(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedup(int increment){
        System.out.println("Applying Speedup");
    }
}
public class CWH_54_Interfaces {
    public static void main(String[] args) {
        AvonCycle cyc=new AvonCycle();
        cyc.applyBrake(1);
        System.out.println(cyc.a); // You can create properties in interfaces
        // You cannot modify the props in Interfaces as they are final
    }
}
