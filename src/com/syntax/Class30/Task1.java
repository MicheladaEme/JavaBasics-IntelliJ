package com.syntax.Class30;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map
         */

        /* List<String> list=new LinkedList<>();
         list.addFirst("Anton"); */

        HashMap<Integer,String> buildings=new HashMap<>();
        buildings.put(1,"Google");
        buildings.put(2,"Apple");
        buildings.put(3,"Tesla");
        buildings.put(1,"Amazon");
        buildings.put(4,"Amazon");
        buildings.put(5,"Syntax");
        buildings.put(6,"Multiverse");
        System.out.println(buildings.size());
        System.out.println(buildings);
        buildings.replace(41,"Facebook"); //update the value
        System.out.println(buildings);
    }
}
