# INHERITANCE IN JAVA LESSON #2
As simple as it means, inheritance is owning something from someone when they die.
In Java, classes can inherit characteristics from other classes and they are not supposed to be "dead" for us to inherit the characteristics.
So 

**WHY IS INHERITANCE IMPORTANT IN OOP**
Well, it minimizes rewriting the classes multiple times and it decreases the complexity of the code so others can easily understand the logic behind.
For now you would not understand but when writing code for large programs and it involves not just one but many programmers, inheritance can be a great help.

**HOW ITS DONE**
So lets say you have two classes, Bicycle and MountainBike
Class Bicycle has two attributes, speed and gear
Class MountainBike also have those attributes but has an extra attribute of seatHeight.

Now Class MountainBike can inherit the attributes from class Bicycle and also have its own seatHeight attribute.

**EXTENDS KEYWORD**
When you want to inherit a class, the keword **extends** is used as seen in the MountainBike file.
This lets Java know that hey, i'm inheriting this class and i will have the same attributes as it has.

**SUPER KEYWORD**
Initialising the constructors used in the super class (The main class as in our case the Bicycle class) we use the keyword super.
Without it, you cant really use the attributes in the superclass in your sub class (The class that in herits attributes)

