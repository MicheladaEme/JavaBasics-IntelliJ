package com.syntax.Class23;

public class Task6 {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    public static void main(String[] args) {
        CreditCard creditcard=new CreditCard(8.75,1000);
        creditcard.getInterest();
        Visa visa=new Visa(8.75,1000);
        visa.getInterest();
        AX ax=new AX(8.75,1000);
        ax.getInterest();
    }
}
class CreditCard{
    double balance;
    double interest;
    double interestRate;

    public CreditCard(double interestRate, double balance) {
        this.balance=balance;
        this.interestRate=interestRate;
    }

    public void getInterest() {
        interest=(interestRate*balance);
        System.out.println(interest);
    }
}
class Visa extends CreditCard{
    public Visa(double interestRate, double balance) {
        super(interestRate, balance);
    }
}
class AX extends CreditCard{
    public AX(double interestRate, double balance) {
        super(interestRate, balance);
    }
    @Override
    public void getInterest() {
        interest=(interestRate*balance)+2;
        System.out.println(interest);
    }
}
