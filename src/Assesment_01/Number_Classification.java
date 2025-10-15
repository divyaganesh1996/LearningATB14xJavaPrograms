package Assesment_01;

import java.util.Scanner;

public class Number_Classification {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = s.nextInt();

        if(a == 0)
        {
            System.out.println("The number is zero");
        }
        else if(a > 0)
        {
            System.out.println("The number is positive");
        }
        else if(a < 0)
        {
            System.out.println("The number is negative");
        }


        s.close();
    }
}
