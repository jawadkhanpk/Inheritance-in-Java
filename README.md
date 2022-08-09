Inheritance is used to borrow the properties and methods from another class.

Like:
# Phone -> smart phone
# Class -> subclass


# Interitance in java can be declare using "extends" keyword.


# Q: Why Inheritance is not supported in Java?
The reason behind this is to prevent ambiguity. Consider a case where class B extends class A and Class C and both class A and C have the same method display().
Now java compiler cannot decide, which display method it should inherit. To prevent such situation, multiple inheritances is not allowed in java
