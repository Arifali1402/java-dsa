import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age > 18) {
        // System.out.println("You are greater than 18");
        // } else {
        // System.out.println("You are not greater than 18");
        // }
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        // System.out.println("Number is Even");
        // } else {
        // System.out.println("Number is Odd");

        // }
        // int a, b;
        // a = sc.nextInt();
        // b = sc.nextInt();
        // if (a == b) {
        // System.out.println("a is equal to b");
        // }
        // else if (a > b) {
        // System.out.println("a is greater than b");
        // }
        // else{
        // System.out.println("b is greater than a");
        // }

        // int button = sc.nextInt();
        // if(button == 1){
        // System.out.println("Hello");
        // }
        // else if(button == 2){
        // System.out.println("Namaste");
        // }
        // else if(button == 3){
        // System.out.println("Bonjour");
        // }
        // else{
        // System.out.println("Invalid Input");
        // }

        // Switch
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Ola");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}
