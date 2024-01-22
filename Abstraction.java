abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are creating a New Animal");
    }

    public void eat() {
        System.out.println("Animal Eats");
    }

    final void tail() {
        System.out.println("They all have a tail");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Creating a Horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
    // // Throws an error --> Cannot override the final method from Animal
    // public void tail(){
    // System.out.println("Have a short tail");
    // }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        // // Throws a Runtime-error: Animal is abstract; cannot be instantiate
        // Animal animal = new Animal();
        // animal.walk();
    }
}