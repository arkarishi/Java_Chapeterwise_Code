package com.company;

public class CWH_14_String_Methods {
    public static void main(String[] args) {
        String name="Harry";
        //     index-01234 ^
        System.out.println(name);

        int value=name.length();
        System.out.println(value);

        String lstring=name.toLowerCase();
        System.out.println(lstring);

        String ustring=name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString="    Harry    ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rry","ier"));
        System.out.println(name.replace("r","ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.startsWith("rry"));

        System.out.println(name.charAt(1));

        String modifiedName="Harryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("r",4));
        System.out.println(name.lastIndexOf("rry"));
        System.out.println(name.lastIndexOf("rry",4));

        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("haRRy"));

        System.out.println(" \"I am escape sequence \" \n double quote");
    }
}
