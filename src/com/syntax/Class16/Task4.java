package com.syntax.Class16;

public class Task4 {
    public static void main(String[] args) {
        //Task 4 How would you reverse a String word by word? for example
        //  input=>This is sentence i want to reverse
        //  output=>sihT si ecnetnes i tnaw ot esrever

        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(a.split("[?]").length);
        String reversed="";
        for(int i=a.length()-1; i>=0; i--){
            reversed+=a.charAt(i);
        }
        System.out.println(reversed);

        //Teacher Example
        StringBuilder stringBuilder=new StringBuilder("Sunday");
        System.out.println(stringBuilder.reverse());

    }
    String reverseString(String inputString) {
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
