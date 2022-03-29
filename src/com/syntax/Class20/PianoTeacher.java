package com.syntax.Class20;

public class PianoTeacher extends Teacher {
    void music(){
        System.out.println("Today I will teach music");
    }
    public static void main(String[] args) {
        PianoTeacher example2=new PianoTeacher();
        example2.teach();
        example2.music();
    }

}
