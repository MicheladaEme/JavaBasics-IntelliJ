package com.syntax.Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create an arrayList of
        cars and retrieve all the values using 3 different ways.
         */

        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Porsche");
        System.out.println(cars);
        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        int i=0;
        while(i<cars.size()){
            System.out.println(cars.get(i));
        }
        Iterator<String> iterator=cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //ArrayList<String> cars=new ArrayList<>(Arrays.asList("BMW","Audi","Porsche"));
        //will discuss that in next class why we should not use this approach
    }
}
