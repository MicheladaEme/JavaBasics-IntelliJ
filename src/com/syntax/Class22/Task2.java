package com.syntax.Class22;

public class Task2 {
    //Write program: Shape class has a constructor that takes the radius and has a subclass as circle class.
    // In circle class create a method to calculate the area of circle. Test your code

    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle.Area(12));
    }
}
class Shape{
    double radius;

}
class Circle extends Shape{
    double area;

    double Area(double radius){
       // area=3.14159*(radius*radius); old way
        area=(Math.PI*Math.pow(radius, 2)); //Teacher way
        return area;
    }
}
