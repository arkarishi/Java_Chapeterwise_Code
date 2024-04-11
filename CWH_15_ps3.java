package com.company;
import java.util.Scanner;

public class CWH_15_ps3 {
    public static void main(String[] args) {
        // Problem 1
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        name=name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text =" To Lower Case ";
        text=text.replace(' ','_');
        System.out.println(text);

        // Problem 3
        String letter="Dear <|name|>, Thanks a lot!";
        String name1= sc.nextLine();
        letter=letter.replace("<|name|>",name1);
        System.out.println(letter);

        // Problem 4
        String myString= "This string contains double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter="Dear Harry,\n\t This Java Course is Nice.\n\t Thanks!";
        System.out.println(myLetter);
    }
}
