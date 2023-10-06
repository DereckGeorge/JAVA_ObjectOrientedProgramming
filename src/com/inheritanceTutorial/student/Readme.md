## Java Inheritance Demo - BIT Course Representatives

This Java program demonstrates the concept of inheritance using a BIT (Bachelor of Information Technology) course example. We have two class representatives: a boy named Derek and a girl named Jackie.
Class Hierarchy

We'll create a class hierarchy with a base class called "Student" and two subclasses, "Boy" and "Girl," which will inherit properties and methods from the "Student" class while also having additional properties specific to Derek and Jackie.
Student Class (Base Class)

The Student class contains common properties and methods for all students:

    name: The name of the student.
    age: The age of the student.
    studentID: The unique student identification.
    introduce(): A common method to introduce the student.

## Boy Class (Subclass)

The Boy class is a subclass of Student and includes an additional property:

    favoriteSport: The favorite sport of the boy.
    playSport(): A method specific to boys for expressing their love for a particular sport.

## Girl Class (Subclass)

The Girl class is another subclass of Student and includes an additional property:

    favoriteSubject: The favorite subject of the girl.
    study(): A method specific to girls for discussing their favorite subject.

## Usage

In the InheritanceDemo class, we demonstrate the inheritance concept:

    Create a Boy object named Derek with his information (name, age, student ID, and favorite sport).
    Create a Girl object named Jackie with her information (name, age, student ID, and favorite subject).
    Call the common method introduce() to introduce both Derek and Jackie as students.
    Call the specific methods playSport() for Derek and study() for Jackie to showcase their unique characteristics.
