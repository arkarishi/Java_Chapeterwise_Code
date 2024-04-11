package com.company;
interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void recordVideoIn4k(){
        System.out.println("Recording in 4k");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling: "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
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
public class CWH_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms=new MySmartPhone();
        ms.recordVideoIn4k();
        String[] ar=ms.getNetworks();
        for (String item:ar){
            System.out.println(item);
        }
    }
}
