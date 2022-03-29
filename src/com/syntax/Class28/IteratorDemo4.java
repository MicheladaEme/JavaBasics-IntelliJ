package com.syntax.Class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo4 {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");
        Iterator<String> iterator=courses.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("Java")){
                iterator.remove();
            }
        }
        //When you are doing any operations on the Lists that
        //can change its size use Iterator otherwise you can
        //use loops
        System.out.println(courses);
    }
}
