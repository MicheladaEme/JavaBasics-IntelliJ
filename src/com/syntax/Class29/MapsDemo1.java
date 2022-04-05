package com.syntax.Class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Asghar Nazir");
        names.add("Muhammad");
        System.out.println(names.get(0));

        HashMap<Integer, String> map=new HashMap<>();
        map.put(123456789,"Asghar Nazir");
        map.put(123456,"Muhammad");
        System.out.println(123456789);

        HashMap<String,String> groceries=new HashMap<>();
        groceries.put("Lilly","Eggs, milk, bread etc");
        groceries.put("Teyfur","Camel, Horse, CamelHorse etc");
        groceries.put("Asghar","Macbook, Iphone 13, Apple Monitor stand for 1000$ etc");
        System.out.println(groceries.get("Lilly"));
    }
}
