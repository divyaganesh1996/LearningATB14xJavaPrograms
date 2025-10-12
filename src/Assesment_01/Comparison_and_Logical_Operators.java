package Assesment_01;

public class Comparison_and_Logical_Operators {
    public static void main(String[] args) {
        // Declare and initialize variables
        int a = 10;
        int b = 5;
        int c = 10;
        boolean isSunny = true;
        boolean isWeekend = false;

        System.out.println("Demonstrating Comparison Operators:");
        System.out.println("-----------------------------------");

        // Equal to (==)
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a == c: " + (a == c)); // true

        // Not equal to (!=)
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a != c: " + (a != c)); // false

        // Greater than (>)
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("b > c: " + (b > c));   // false

        // Less than (<)
        System.out.println("a < b: " + (a < b));   // false
        System.out.println("b < c: " + (b < c));   // true

        // Greater than or equal to (>=)
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a >= c: " + (a >= c)); // true

        // Less than or equal to (<=)
        System.out.println("a <= b: " + (a <= b)); // false
        System.out.println("a <= c: " + (a <= c)); // true

        System.out.println("\nDemonstrating Logical Operators:");
        System.out.println("----------------------------------");

        // Logical AND (&&)
        // True if both conditions are true
        System.out.println("isSunny && isWeekend: " + (isSunny && isWeekend)); // false
        System.out.println("isSunny && (a == c): " + (isSunny && (a == c)));   // true

        // Logical OR (||)
        // True if at least one condition is true
        System.out.println("isSunny || isWeekend: " + (isSunny || isWeekend)); // true
        System.out.println("isWeekend || (a > c): " + (isWeekend || (a > c))); // false

        // Logical NOT (!)
        // Inverts the boolean value
        System.out.println("!isSunny: " + (!isSunny));     // false
        System.out.println("!(a != b): " + (!(a != b))); // false
    }
}
