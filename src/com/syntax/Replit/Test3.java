package com.syntax.Replit;

public class Test3 {
    //120
    int year;
        String schoolName;
        int batchNum;

    void Test3(int year, String schoolName, int batchNum) {
        this.year = year;
        this.schoolName = schoolName;
        this.batchNum = batchNum;
    }

    public static void main (String[] args){
            Test3 main=new Test3();
            main.year=2022;
            main.schoolName="Syntax";
            main.batchNum=12;
            System.out.println("I am student of batch "+main.batchNum+" studying at "+main.schoolName+" in the year of "+main.year);
        }


}
