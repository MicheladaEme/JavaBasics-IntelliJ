package com.syntax.Class25;

public class ComputerTester {

    public static void main(String[] args) {

        Computer[] laptops={new Apple(),new Lenovo(),new HP(),new Dell()};

        for(Computer laptop:laptops){
            laptop.bootUp();
            laptop.restart();
            laptop.shutDown();
            laptop.officeSoftware();
            laptop.os();

        }
    }
}
