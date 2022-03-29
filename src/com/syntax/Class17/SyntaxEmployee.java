package com.syntax.Class17;

public class SyntaxEmployee {
    //Create a Class called Employee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class Employee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects
    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee aselsClassObject=new SyntaxEmployee();
        aselsClassObject.empId="123";
        aselsClassObject.salary=200000;
        System.out.println(aselsClassObject.empId);
        System.out.println(aselsClassObject.salary);
        //System.out.println(aselsClassObject.CEO); //Bad practice
        System.out.println(SyntaxEmployee.CEO); // A good practice

        SyntaxEmployee mozzamObject=new SyntaxEmployee();
        mozzamObject.empId="456";
        mozzamObject.salary=198000;
        System.out.println(mozzamObject.empId);
        System.out.println(mozzamObject.salary);
        System.out.println(SyntaxEmployee.CEO);

    }
}
