package com.syntax.Replit;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit188 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0; i<6; i++){
            arrayList.add(scan.nextInt());
        }
        Integer [] nums = arrayList.toArray(new Integer[6]);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
