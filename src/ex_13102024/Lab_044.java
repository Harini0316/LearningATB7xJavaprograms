package ex_13102024;

public class Lab_044 {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening
        byte b=10;
        int a=b; // VALID – Implicit Casting - done by JVM automatically
        int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);

        // Narrowing
        int val = 300; //00000000000000000000000100101100 - stores only 0100101100 - which is 44
        //byte b1 = val; // Invalid - Implicit Casting - JVM
        byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);

    }
}
