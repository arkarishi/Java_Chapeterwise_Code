package com.company;

interface MyCamera1{
    void takeSnap();
    void recordVideo();
    default void recordVideoIn4k(){
        System.out.println("Recording in 4k");
    }
}
interface MyWifi1{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling: "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone1 extends MyCellPhone1 implements MyWifi1,MyCamera1{
    public void takeSnap(){
        System.out.println("Taking Snap...");
    }
    public void recordVideo(){
        System.out.println("Taking Video");
    }

    //    public void recordVideoIn4k(){
//        System.out.println("Taking a Snap...");
//    }
    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of Networks");
        String[] networkList={"Harry", "Prashant","Anjali56"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to"+network);
    }
}

public class CWH_59_polymorphism_interfaces {
    public static void main(String[] args) {
        MyCamera1 cam1=new MySmartPhone1(); // This is a smartphone but please use it as a camera
        // cam1.getNetworks(); --> Not Allowed
        cam1.recordVideoIn4k();

    }
}
