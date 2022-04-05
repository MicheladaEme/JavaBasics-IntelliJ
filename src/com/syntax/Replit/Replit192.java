package com.syntax.Replit;

import java.util.LinkedList;
import java.util.List;

public class Replit192 {
    public static void main(String[] args) {
        List<Integer> prime=new LinkedList<>();
        int ct=0,n=0,i=1,j=1;
        while(n<25)
        {
            j=1;
            ct=0;
            while(j<=i)
            {
                if(i%j==0)
                    ct++;
                j++;
            }
            if(ct==2)
            {
                prime.add(i);
                n++;
            }
            i++;
        }
        System.out.println(prime);
    }
}
