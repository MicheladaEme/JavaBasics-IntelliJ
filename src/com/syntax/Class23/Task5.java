package com.syntax.Class23;

public class Task5 {
    //Create a class 'Degree' having a method 'getPrerequisite' that prints
    // "To get a degree you need high school diploma".
    //Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
    // In Masters class override method 'getPrerequisite'.
    //Call the method by creating an object of each of the three classes.

    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();
        Bachelors bachelor=new Bachelors();
        bachelor.getPrerequisite();
        Masters master=new Masters();
        master.getPrerequisite();
    }
}
class Degree{

   void getPrerequisite(){
       System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{
    void Bachelors() {
    }
}
class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Masters degree you need high school diploma");
    }
}

