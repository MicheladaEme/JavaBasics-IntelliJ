package com.syntax.ReviewClass10;

public class Bike {
    int maxSpeed=100;
    int engineCC=150;
    void printMaxSpeed(){
        System.out.println(maxSpeed);
    }
    void printEngineCC(){
        System.out.println(engineCC);
    }
}
class HondaBikes extends Bike{
    int maxSpeed=150;
    int engineCC=125;
    void printEngineCC(){
        System.out.println(engineCC);
    }

    void printMaxSpeed(){
        int maxSpeed=200;
        System.out.println(this.maxSpeed);
    }

    void printInfoFromParentAndChild(){
        printEngineCC();
        this.printEngineCC();
        super.printEngineCC();
    }
}

