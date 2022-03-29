package com.syntax.Replit;

public class Test2 {
    void censorLetter(String word, char symbol){
        System.out.println(word.replaceAll("[symbol]", "*"));
    }

    public static void main(String[] args){
        Test2 main=new Test2();
        main.censorLetter("computer science",'e');
        main.censorLetter("trick or treat",'t');
    }
}
