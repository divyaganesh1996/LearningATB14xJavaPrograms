package Assesment_01;

public class Increment_and_Decrement_Operators {
    public static void main(String[] args) {
        // Pre-increment operator (++)
        int a = 5;
        System.out.println("Original value of 'a': " + a); // Output: 5
        int b = ++a; // 'a' is incremented to 6, then its new value is assigned to 'b'
        System.out.println("After pre-increment: b = ++a");
        System.out.println("Value of 'a': " + a); // Output: 6
        System.out.println("Value of 'b': " + b); // Output: 6

        System.out.println("\n-----------------------------------\n");

        // Post-increment operator (++)
        int x = 10;
        System.out.println("Original value of 'x': " + x); // Output: 10
        int y = x++; // The current value of 'x' (10) is assigned to 'y', then 'x' is incremented to 11
        System.out.println("After post-increment: y = x++");
        System.out.println("Value of 'x': " + x); // Output: 11
        System.out.println("Value of 'y': " + y); // Output: 10

        System.out.println("\n-----------------------------------\n");

        // Pre-decrement operator (--)
        int p = 15;
        System.out.println("Original value of 'p': " + p); // Output: 15
        int q = --p; // 'p' is decremented to 14, then its new value is assigned to 'q'
        System.out.println("After pre-decrement: q = --p");
        System.out.println("Value of 'p': " + p); // Output: 14
        System.out.println("Value of 'q': " + q); // Output: 14

        System.out.println("\n-----------------------------------\n");

        // Post-decrement operator (--)
        int m = 20;
        System.out.println("Original value of 'm': " + m); // Output: 20
        int n = m--; // The current value of 'm' (20) is assigned to 'n', then 'm' is decremented to 19
        System.out.println("After post-decrement: n = m--");
        System.out.println("Value of 'm': " + m); // Output: 19
        System.out.println("Value of 'n': " + n); // Output: 20
    }
}
