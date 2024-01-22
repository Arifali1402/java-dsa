class Student {
    String name;
    int age;

    // Overloading
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shah Rukh Khan";
        s1.age = 56;
        s1.printInfo(s1.name,s1.age);
    }
}