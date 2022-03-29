package com.syntax.Class27;

import java.util.ArrayList;

public class Task {
    /*
    Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Emely");
        names.add("Angel");
        names.add("Pricila");
        names.add("Jennifer");
        names.add("Michael");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Emely"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
