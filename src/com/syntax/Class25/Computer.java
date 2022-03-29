package com.syntax.Class25;

class Task1 {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available methods.
}
public abstract class Computer{
    int memory;
    int storage;
    String os;

    public void bootUp(){
        System.out.println("Boot up computer");
    }

    public void restart(){
        System.out.println("Machine restarting");
    }

    public void shutDown(){
        System.out.println("Shutting down");
    }

    abstract void officeSoftware();
    abstract void os();
}
class Apple extends Computer{
    String appleChip;
    String touchId;

    public void terminal(){
        System.out.println("Open terminal");
    }

    void officeSoftware(){
        System.out.println("Open Pages, Numbers, & Keynote");
    };

    void os(){
        System.out.println("MacOS");
    };
}
class Lenovo extends Computer{
    public void cmdPrompt(){
        System.out.println("Open Command Prompt");
    }

    void officeSoftware(){
        System.out.println("Open Word, Excel, & OneNote");
    };
    void os(){
        System.out.println("Chrome OS & Windows");
    };
}
class HP extends Computer{
    public void cmdPrompt(){
        System.out.println("Open Command Prompt");
    }
    void officeSoftware(){
        System.out.println("Open Word, Excel, & OneNote");
    };
    void os(){
        System.out.println("Windows");
    };
}
class Dell extends Computer{
    public void cmdPrompt(){
        System.out.println("Open Command Prompt");
    }
    void officeSoftware(){
        System.out.println("Open Word, Excel, & OneNote");
    };
    void os(){
        System.out.println("Windows");
    };
}
