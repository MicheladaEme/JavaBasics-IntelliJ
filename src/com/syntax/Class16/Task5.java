package com.syntax.Class16;

public class Task5 {
    public static void main(String[] args) {
        //Task 5 How would you check if String is palindrome or not? aba=> true
        //Abbc =>false
        String pal="aba";
        String reverse="";
        for(int i=pal.length()-1; i>=0; i--){
            reverse+=pal.charAt(i);
        }
        boolean palindrome=true;
        if(pal.equalsIgnoreCase(reverse)){
            System.out.println(palindrome);
        } else{
            System.out.println(!palindrome);
        }

        //Teacher Example
        Task5 task=new Task5();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("abbc"));
    }
    boolean isPalindrome(String inputStr){
        String reversedStr=reverseString(inputStr);//reversing a word
        return reversedStr.equals(inputStr);// checking if words are same
    }

    String reverseString(String inputString){
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
