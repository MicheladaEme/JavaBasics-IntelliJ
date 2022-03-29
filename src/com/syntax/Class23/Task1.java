package com.syntax.Class23;

public class Task1 {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
}
class Area{
    double length;
    double width;
    double height;
    double side;
    public double rectangle(double length, double width){
        return length*width;
    }
    public double square(double side){return Math.pow(side, 2);}
    public double boxVolume(double length, double width, double height){
        return length*width*height;
    }
}
