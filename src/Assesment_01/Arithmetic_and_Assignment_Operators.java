package Assesment_01;

import java.util.Scanner;

public class Arithmetic_and_Assignment_Operators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a =s.nextInt();
        System.out.println("Enter second number");
        int b=s.nextInt();
        int c=0;
        System.out.println("Addition : "+ (a+b));
        System.out.println("Subtraction : "+ (a-b));
        System.out.println("Multiplication : "+ (a*b));
        System.out.println("Division : "+ (a/b));
        System.out.println("Modulus : "+ (a%b));

        System.out.println(c = a);
        System.out.println(c += a);
        System.out.println(c -= a);
        System.out.println(c *= a);
        System.out.println(c /= a);

    }
}
