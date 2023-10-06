// Base class: Student
class Student {
    private String name;
    private int age;
    private String studentID;

    // Constructor
    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    // Common method for all students
    public void introduce() {
        System.out.println("My name is " + name + ", and I am " + age + " years old.");
    }
}

// Subclass: Boy
class Boy extends Student {
    private String favoriteSport;

    // Constructor
    public Boy(String name, int age, String studentID, String favoriteSport) {
        super(name, age, studentID);
        this.favoriteSport = favoriteSport;
    }

    // Additional method for boys
    public void playSport() {
        System.out.println("I love playing " + favoriteSport + "!");
    }
}

// Subclass: Girl
class Girl extends Student {
    private String favoriteSubject;

    // Constructor
    public Girl(String name, int age, String studentID, String favoriteSubject) {
        super(name, age, studentID);
        this.favoriteSubject = favoriteSubject;
    }

    // Additional method for girls
    public void study() {
        System.out.println("My favorite subject is " + favoriteSubject + ".");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create a Boy object
        Boy derek = new Boy("Derek", 20, "BIT001", "football");

        // Create a Girl object
        Girl jackie = new Girl("Jackie", 19, "BIT002", "programming");

        // Call common method
        derek.introduce();
        jackie.introduce();

        // Call additional methods
        derek.playSport();
        jackie.study();
    }
}
