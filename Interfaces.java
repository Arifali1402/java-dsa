// Pure abstraction

interface Animal {
    int eyes = 2;
    public void walk();
    // or void walk();
    // can't create a constructor
    // Animal();
    // cannot have a non-abstract function and implementation is also not allowed
    // void eat(){
    // }
}

interface Herbivore{
    
}

// Just like multiple inheritance
class Horse implements Animal,Herbivore {
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
