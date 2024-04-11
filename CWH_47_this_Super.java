package com.company;


class Ekclass{
    int a;
    Ekclass(int a){
        this.a=a;
    }

    public int getA() {
        return a;
    }

    public int returnone(){
        return 1;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("I am a Constructor");
    }

}
public class CWH_47_this_Super {
    public static void main(String[] args) {
        Ekclass e=new Ekclass(65);
        Doclass d=new Doclass(5);
        System.out.println(e.getA());

    }
}
