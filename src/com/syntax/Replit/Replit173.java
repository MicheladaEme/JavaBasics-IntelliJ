package com.syntax.Replit;

public class Replit173 {

}
abstract class Tea{
    String teaType;

    public Tea(){

    }

    public Tea(String teaType){
        this.teaType=teaType;
    }

    public abstract void addSugar();
}
class ChaiTea extends Tea{
    public void addSugar(){
        System.out.println("For Chai Tea we need 1 spoon of sugar");
    }
}
class LemonTea extends Tea{
    public void addSugar(){
        System.out.println("For Lemon Tea we need 2 spoon of sugar");
    }
}
