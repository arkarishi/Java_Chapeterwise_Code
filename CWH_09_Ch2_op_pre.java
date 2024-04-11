package com.company;

public class CWH_09_Ch2_op_pre {
    public static void main(String[] args) {
        int a=6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis of the left to right associativity
              =30-34/2
              =30-17
              =13
         */
        int b=60/5-34*2;
        /*
              =12-34*2
              =12=68
              =-56
         */
        System.out.println(a);
        System.out.println(b);
        // Precedence & Associativity

        //Quick Quiz

        double b1=1;
        double c1=4;
        double a1=5;
        double k=(b1*b1-4*a1*c1)/(2*a1);
        System.out.println(k);
    }
}
