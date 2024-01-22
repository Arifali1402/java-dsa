import java.util.*; // <--- Java Package
import bank;

public class Packages {
    class Shape {
        String color;

        public void area() {
            System.out.println("Display Area");
        }
    }

    // Single Level Inheritance
    class Triangle extends Shape {
        public void area(int l, int h) {
            System.out.println(1 / 2 * l * h);
        }
    }

    // Multi-level Inheritance
    class EquilateralTriangle extends Triangle {
        public void area(int l, int h) {
            System.out.println(1 / 2 * l * h);
        }
    }

    // Hierarchical Inheritance
    class Circle extends Shape {
        public void area(int r) {
            System.out.println((3.14) * r * r);
        }
    }

    // Hybrid Inheritance -> ALL inheritance in this inheritance
    // Multiple Inheritance -> Not present in Java in class form. Here , we use
    // Interface.

    public static void main(String[] args) {
        bank.Account account1 = new bank.Account();
        account1.name = "Arif Ali";

    }
}
