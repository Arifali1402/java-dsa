import java.util.*;

public class Bits {
    public static void main(String[] args) {

        // // getBit()
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;
        // if((bitMask & n)==0){
        // System.out.println("Bit was zero");
        // }
        // else{
        // System.out.println("Bit was one");
        // }

        // //setBit()
        // int n = 4;
        // int pos = 3;
        // int bitMask = 1<<pos;
        // int newNumber = n | bitMask;
        // System.out.println(newNumber);

        // // clearBit()
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;
        // int notBitMask = ~(bitMask);
        // int newNumber = (n & notBitMask);
        // System.out.println(newNumber);

        // updateBit()
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        System.out.println("Choose the operation for updation(0 or 1):");
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper == 0 means Clear the bit from the position
        if (oper == 0) {
            System.out.println("Operation:1 i.e, clear");
            int notBitMask = ~(bitMask);
            int newNumber = (n & notBitMask);
            System.out.println(newNumber);
        }
        // oper == 1 means SetBit
         else if(oper == 1) {
            System.out.println("Operation:2 i.e, SetBit");
            int newNumber = (n | bitMask);
            System.out.println(newNumber);
        }
        else{
            System.out.println("Choose between 1 or 2");
        }
        sc.close();
    }

}