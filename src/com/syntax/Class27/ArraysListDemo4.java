package com.syntax.Class27;

import java.util.ArrayList;

public class ArraysListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple"); //shift+F6 replace
        fruit.add("Orange");
        fruit.add("Banana");

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Carrot");

        ArrayList<String> groceries=new ArrayList<>();
        groceries.addAll(fruit);
        groceries.addAll(vegetables);
        System.out.println(groceries);
    }
}
