package com.syntax.Class18;

public class AccessModifiersTester {
    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        //System.out.println(am.name);//Can't access as name has private access
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);
    }
}
