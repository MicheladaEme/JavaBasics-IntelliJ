package com.syntax.Replit;

public class Replit139 {
}
class Main1 {

    public static String alphabetical(String str){
        String word = "" + str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)<str.charAt(i)){
                word=word+str.charAt(i);
            }
        }
        return word;
    }
    public static void main(String[] args){
        System.out.println(alphabetical("hello"));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}
