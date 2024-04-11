package com.company;

public class cwh_24_ch4_break_continue {
    public static void main(String[] args) {
        // Break and Continue using loops!
//        for (int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is Great!");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }

        int i=0;
        while (i<5){
            System.out.println(i);
            System.out.println("Java is Great!");
            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }
        System.out.println("Loop  ends here");
    }
}
