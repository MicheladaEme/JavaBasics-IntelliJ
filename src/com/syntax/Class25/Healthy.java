package com.syntax.Class25;

public interface Healthy {
    void Healthy();
}
interface Portable{
    void canCarry();
}
interface Eatable{
    void eat();
}
class Orange implements Healthy,Portable,Eatable{

    public void Healthy() {
        System.out.println("Orange is healthy to eat");
    }
    public void canCarry() {
        System.out.println("We can carry orange easily");
    }
    public void eat() {
        System.out.println("we can eat orange");
    }
}
class Laptop implements Portable{
    public void canCarry() {
        System.out.println("We can carry a laptop easily");
    }
}
