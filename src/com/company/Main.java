package com.company;

                                        // inheritance is used to borrow properties from existing class,  or properties from base to derived class.
class Base{                             // or sub-class extends super class  // super is parent class and sub-class is child
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base setting x now");
        this.x = x;
    }
}

class Derived extends Base{

int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here

    // creating an object of base class
    Base b = new Base();

    b.setX(4);
        System.out.println(b.getX());

    // creating an object of derived class
        Derived d = new Derived();

    d.setY(43);
        System.out.println(d.getY());
    }
}
