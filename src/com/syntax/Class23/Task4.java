package com.syntax.Class23;

public class Task4 {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
}
class Baked{
    String chocolate;
    String cocoa;
    double oz;
    String flour;
    String vanilla;
    static int bakersDozen=13;
    private void brownie(String chocolate, String flour, String cocoa, int bakersDozen){
        System.out.println("Brownies are delicious");
    }
    private void cookie(int numOfEggs, String flour, String chocolate){
        System.out.println("Cookies are delicious");
    }
    private void cupcake(String vanilla, String flour){
        System.out.println("Cupcakes are delicious");
    }
    public static void main(String[] args) {
        Baked bakedgood=new Baked();
        bakedgood.cupcake("vanilla", "flour");
        bakedgood.cookie(2, "flour", "chocolate");
        bakedgood.brownie("choclate","flour","cocoa", 13);
    }
}
