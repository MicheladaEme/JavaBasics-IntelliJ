package com.syntax.ReviewClass8;

public class Class2 {

    String generateUsername(String firstName, String lastName){
        return firstName+"123"+lastName+".com";
    }

    static void moreedDemand(){
        System.out.println("This is moreed's functions");
    }

    public static void main(String[] args) {
        moreedDemand();
        Class2 obj=new Class2();
        System.out.println(obj.generateUsername("Emilia","gulnar"));
    }
}
