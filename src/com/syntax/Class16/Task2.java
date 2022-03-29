package com.syntax.Class16;

public class Task2 {
    public static void main(String[] args) {
        //Task 2 Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric characters are there in the String.
        String alpha="#Blu3B3rr1$";
        String beta=alpha.replaceAll("[!-/]","");
        System.out.println(beta.length());
    }
}
