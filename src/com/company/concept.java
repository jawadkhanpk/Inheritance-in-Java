package com.company;

class Parent{

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base setting x now");
        this.x = x;
    }
}

class Child extends Parent{}


public class concept{
    public static void main(String[] args){

        System.out.println("Hello World");

        Derived obj = new Derived();
        obj.setX(4);
        System.out.println(obj.getX());
    }
}