package com.syntax.Class19;

public class Task2Tester {
    public static void main(String[] args) {
        Task2 student1=new Task2("Emely",98, 54, 87);
        student1.AverageGrade();

        Task2 student2=new Task2("Angel",36, 70, 64);
        student2.AverageGrade();

        Task2 student3=new Task2("Pricila",98, 100, 77);
        student3.AverageGrade();

        Task2 student4=new Task2("Michael",68, 70, 59);
        student4.AverageGrade();

        Task2 student5=new Task2("Mariella",96, 72, 87);
        student5.AverageGrade();

        //Teacher Example

        Task2 maha=new Task2("maha",95,96,92);
        maha.printAvgGrade();
        new Task2("Emiliaaaa",97,93,91).printAvgGrade();

    }
}
