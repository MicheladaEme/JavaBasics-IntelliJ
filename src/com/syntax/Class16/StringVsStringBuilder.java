package com.syntax.Class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s= new String("Asghar is Great");
        s.concat("hahah");
        //System.out.println(s.concat("Hahah"));
        System.out.println(s);

        StringBuilder stringBuilder=new StringBuilder("Asghar is Great");

        stringBuilder.append("Hahha"); //add new String hahha to the string
        System.out.println(stringBuilder.append("Hahha"));
        System.out.println(stringBuilder); //printing out the original string


    }
}
