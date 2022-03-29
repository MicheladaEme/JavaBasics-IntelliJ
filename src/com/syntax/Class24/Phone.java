package com.syntax.Class24;

public abstract class Phone {
    void makePhoneCall(){
        System.out.println("Make a phone call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPicture();
    abstract void unlockPhone();
}
class Iphone extends Phone{
    void displayPicture(){
        System.out.println("Use the photo app to display pics");
    }
    void unlockPhone(){
        System.out.println("Use the faceId Unlock to open this phone");
    }
}
class Samsung extends Phone{
    void displayPicture(){
        System.out.println("Use gallery to display pics");
    }
    void unlockPhone(){
        System.out.println("Use the face Unlock and display finger print to unlock the phone");
    }
}
