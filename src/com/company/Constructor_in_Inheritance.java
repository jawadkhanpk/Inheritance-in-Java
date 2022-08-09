package com.company;
//    use comment and un-comment to verify the constructors in inheritance and overloaded constructor


class Basee{                    // this is base class or or super

    Basee(){                    // this is the constructor of base class

        System.out.println("I am a constructor");   // by default if we have overloaded constructor it prints this constructor
                                                    // but if we use super keyword it prints that overloaded constructor
    }

    Basee(int a){                    // this is a overloading of a constructor of base class
        System.out.println("I am an overloaded constructor of base with value of a as:"+a); // just by using super keyword it prints this overloaded constructor in the derived class
    }
}

class Derivedd extends Basee{     // this is derived class or or sub-class which inherits properties of above base class
                                  // even if we didn't write any thing inside derived class it also prints ("i am constructor") by adopting properties of base of super

Derivedd(){                     // this is the constructor of derived class
//    super(4);            // use of super in derived class tells method to execute the overloaded constructor of base class
    System.out.println("I am a constructor of Derived class");
}

Derivedd(int a, int b){
    super (a);
    System.out.println("I am an overloaded constructor of derived class with value of b as:"+b);
}

}
class ChildDerived extends Derivedd{

    ChildDerived(){         // constructor of class ChildDerived
        System.out.println("I am a constructor of class ChildDerived");
    }

    ChildDerived(int a,int b,int c){        // overloaded constructor of class ChildDerived
        super (a,b);
        System.out.println("I am an overloaded constructor of derived class with value of c as:"+c);
    }
}
public class Constructor_in_Inheritance {
    public static void main(String[] args) {

    //Basee b = new Basee();
    //Derivedd d = new Derivedd(4,5);
//    ChildDerived cd = new ChildDerived();
    ChildDerived cd = new ChildDerived(2,3,4);

    }
}
