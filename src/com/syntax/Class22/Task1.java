package com.syntax.Class22;

public class Task1 {
    //Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass userInfo that will have user address variable and it also being initialized through
    // constructor call. Print users name, mobile number and address in userDetails method. Test your code.
    public static void main(String[] args) {
        userInfo task1=new userInfo("Lisa","123-456-2235","123 apple street");
        task1.userDetails();
    }
}
class userClass{
    String name;
    String mobileNumber;

    public userClass() {
    }

    public userClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class userInfo extends userClass{
    String address;

    public userInfo(String name, String mobileNumber,String address) {
        super(name, mobileNumber);
        this.address = address;
    }

    public void userDetails(){
        System.out.println(name+" "+mobileNumber+" "+address);
    }
}
