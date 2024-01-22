class Pen {
    // Properties
    String color; // red, black, blue
    String type; // ballpen, gel

    // functions are called "Members"
    public void write() {
        System.out.println("Write Something...");
    }

    // 'this' is a keyword for java which tells you which object has been called
    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // 1. Non-parameterized constructor (this can be a blank constructor as well)
    Student() {
        System.out.println("Constructor Called...");
    }

    // 2. Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. Copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class OOPS {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Gel";
        // pen1.write();
        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "ballpen";

        // pen1.printColor();
        // pen2.printColor();

        // Calling non-parameterized constructor
        Student s1 = new Student();
        s1.name = "Arif Ali";
        s1.age = 23;
        s1.printInfo();
        // Calling parameterized constructor
        Student s2 = new Student("Aman", 19);
        s2.printInfo();
        
        // Calling copy constructor
        Student s3 = new Student(s1);
        s3.printInfo();
    }
}
