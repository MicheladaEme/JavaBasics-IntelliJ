package com.syntax.Class16;

public class Task3 {
    public static void main(String[] args) {
        //Task 3 You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?

        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(a.split("[?]").length);
        //String reversed="";
        //for(int i=a.length()-1; i>=0; i--){
        //    reversed+=a.charAt(i);
        //}
        //System.out.println(reversed);


    }
}
