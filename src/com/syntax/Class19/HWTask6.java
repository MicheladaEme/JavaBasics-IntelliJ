package com.syntax.Class19;

public class HWTask6 {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    String title;
    String author;

    public HWTask6(String title, String author) {
        this();
        this.title = title;
        this.author = author;
    }

    public HWTask6() {
    }

    public static void main(String[] args) {
        HWTask6 book=new HWTask6("The neverending story","Michael Ende");

    }
}
