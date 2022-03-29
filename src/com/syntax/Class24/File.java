package com.syntax.Class24;

public abstract class File {
    //Create a class File that will have the following behaviors: open, edit, close. Edit and close are
    // implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that
    // will provide specific implementation of open behaviour: Example: to open .java file we need notepad++ or
    // sublime text, to open .doc file we need Microsoft word to be installed etc
    void edit() {
        System.out.println("Edit file");
    }

    void close() {
        System.out.println("Close file");
    }

    abstract void open();
}
class JavaFile extends File{
    void open(){
        System.out.println("notepadd++ is needed to open a Java file");
    }
}
class WordFile extends File{
    void open(){
        System.out.println("Microsoft Word is needed to open a word file");
    }
}
class PDFFile extends File{
    void open(){
        System.out.println("Adobe PDF is needed to open a PDF file");
    }
}
class Task2{
    public static void main(String[] args) {
        /*
        if a method is not present inside the parent class we can't call that method using polymorphism
         */
        /*
        Object[] files={new JavaFile(),new PDFFile(),new WordFile()};
        Object[0].
         */
        File[] files={new JavaFile(),new PDFFile(),new WordFile()};
        for(int i=0; i<files.length; i++){
            files[i].open();
            files[i].edit();
            files[i].close();

            /*
            int i=0;
            while(i<files.length){
                files[i].open();
                files[i].edit();
                files[i].close();
                i++;
            }
             */
        }
    }
}
