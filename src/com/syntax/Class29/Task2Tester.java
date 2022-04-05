package com.syntax.Class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task2Tester {
    /*
    How can you remove all duplicates from the arrayList
    List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("John");
     */

    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("John");
        LinkedHashSet linkedHashSet=new LinkedHashSet(aList);
        aList.clear();
        aList.addAll(linkedHashSet);
        System.out.println(aList);
    }
}
