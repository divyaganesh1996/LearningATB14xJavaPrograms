package Assesment_01;

import java.util.Scanner;

public class Factorial_Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        int n =s.nextInt();
        int fact=1;
        if(n == 0)
        {
            System.out.println(fact = 1);
        }
        else if(n < 0)
        {
            System.out.println("negative number are not allowed");
        }
        else {

            int i = 1;
            while (i <= n) {
                fact = fact*i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
