Inheritance is used to borrow the properties and methods from another class.

Like:
# Phone -> smart phone
# Class -> subclass


# Interitance in java can be declare using "extends" keyword.


# Q: Why Multiple Inheritacen is not Suppoerted in Java?
The reason behind this is to prevent ambiguity. Consider a case where class B extends class A and Class C and both class A and C have the same method display().
Now java compiler cannot decide, which display method it should inherit. To prevent such situation, multiple inheritances is not allowed in java.
* In this case we use interfaces to overcome this issue.

# Inheritance Types

* Single
* Multilevel
* Hierarchical Inheritance
 
![typesofinheritance](https://user-images.githubusercontent.com/97012657/183821756-ea7bfa16-b2a0-49e7-bbb0-b32d38fa3c19.png)
