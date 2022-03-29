package com.syntax.Class18;

import java.util.Scanner;

public class Task1 {
    //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    //Method should be visibly only within same package and accessible by the creating an instance of the class.

    protected int sum(int [] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }
    //Teacher Example
    int sumArray(int [] array){
        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter elements of array");

        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }

        Task1 arraySum=new Task1();
        System.out.println("The sum of my array is "+arraySum.sum(array));
    }
}
