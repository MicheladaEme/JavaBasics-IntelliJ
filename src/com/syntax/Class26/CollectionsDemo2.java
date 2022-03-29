package com.syntax.Class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Iraq");
        countries.add("Ghana");
        countries.add("Eritea");
        countries.add("Afghanistan");
        System.out.println(countries.get(3));
        //System.out.println(countries.get(-1));
        //System.out.println(countries.get(7));
        countries.add(3,"pakistan"); //inserts the elements at this specified index
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove("pakistan");
        System.out.println(countries);
    }
}
