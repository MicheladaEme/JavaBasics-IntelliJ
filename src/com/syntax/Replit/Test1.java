package com.syntax.Replit;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            System.out.println(i+" ");

            for(int j=1; j<3; j++) {
                System.out.print(j+" ");
            }
        }

        int[] numbers={45,78,12,67,55,89,23,77,88};

        for(int i=0; i<numbers.length; i++){
            if(i%2==0){
                System.out.println(numbers[i]);
            }
        }
        //067 Nested For Loops
        for (int y=1; y<=5; y++) {
            for (int x=1; x<=10; x++) {
                System.out.print((y*x)+" ");
            }
            System.out.println();
        }

        //069 Nested For Loops
        int n=7;
        for(int i=1; i<=n; i++){
            int p=1;
            for(int j=i; j<=n; j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            int p=1;
            for(int j=1; j<=i; j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
        //092
        String s1="hello how are you";
        s1.charAt(s1.length()-1);

        //104
        Scanner scanner=new Scanner(System.in);
        // String[] array=new String[5];
        String[] array=new String[5];
        for(int j=0; j<5; j++){
            array[j]=scanner.next();
        }
        for(int i=0; i<5; i++){
            System.out.println(array[i].substring(0,3));
        }

        //105
        String word = scanner.nextLine();
        word.toString().toLowerCase();
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e'|| word.charAt(i)=='i'||
                    word.charAt(i)=='o'|| word.charAt(i)=='u'){
                System.out.print(word.charAt(i));
            }
        }
    }
}
