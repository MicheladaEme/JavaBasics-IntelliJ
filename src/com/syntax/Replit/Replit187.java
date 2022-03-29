package com.syntax.Replit;

import java.util.ArrayList;

public class Replit187 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("yo");
        arrayList.add("sup");
        arrayList.add("yolo");
        arrayList.add("boop");
        for(int i=0; i<arrayList.size(); i++){
            if(i%2==0){
            } else{
                arrayList.remove(i);
            }
        }
        System.out.println(arrayList);
    }
}
