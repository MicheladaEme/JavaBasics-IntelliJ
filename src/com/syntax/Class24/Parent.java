package com.syntax.Class24;

public class Parent {

    final void method(){
        final String name="Vladlen";
        //name="Mr.a"; can reassign if a variable is final
        System.out.println("I am parent");
    }
}
class Child extends Parent{
    /*
    void method(){
    can't override because it is final method
     */

}
