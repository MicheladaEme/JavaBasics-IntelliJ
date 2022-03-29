package com.syntax.Replit;

public class Replit147 {
}
class CarObjects{
    String model;
    double price;
    double quantity;

    CarObjects(String model, double price, double quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }

    public void carStockValue(){
        double stockValue=price*quantity;
        System.out.println(model+" Stock Value "+stockValue);
    }
}
