package com.syntax.Class25;

public interface MoveAble {
    void move();
}
interface DriveAble{
    void drive();
}
interface Car extends DriveAble,MoveAble{

}
class BMW implements Car{
    public void move(){
        System.out.println("we can move the BMW");
    }
    public void drive(){
        System.out.println("we can drive the BMW");
    }
}
