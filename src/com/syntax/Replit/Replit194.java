package com.syntax.Replit;

import java.util.LinkedList;
import java.util.List;

public class Replit194 {
    public static void main(String[] args) {
        List<String> countries=new LinkedList<>();
        List<String> newList = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");
        for(int i=0; i<countries.size(); i++){
            if(countries.get(i).startsWith("A")) {
                countries.remove(i);
            }
        }
        newList.addAll(countries);
    }
}
