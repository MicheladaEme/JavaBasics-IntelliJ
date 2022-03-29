package com.syntax.Class23;

public class Task3 {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    public static void main(String[] args) {
        Cats kitty=new Cats();
        kitty.cat("Mariella");
        kitty.cat(2);
        kitty.cat("Orange","Pink");
    }
}
class Cats{
    String name;
    String color;
    int numOfEars;
    String noseColor;
    static void cat(String name){
        System.out.println(name);
    }
    static void cat(int numOfEars){
        System.out.println(numOfEars);
    }
    static void cat(String color, String noseColor){
        System.out.println(color+" "+noseColor);
    }

    //Teacher example
    public static void method(String name){
        System.out.println("1");
    }
    public static void method(boolean bol){
        System.out.println("2");
    }
    public static void method(int num){
        System.out.println("3");
    }

    public static void main(String[] args) {
        method(true);
        method(15);
    }
}
