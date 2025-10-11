package Assesment_01;

import java.util.Scanner;

public class Number_is_Positive_or_Negative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        if(num == 0)
        {
            System.out.println("Zero is nesither positive not negative");
        }
        else if(num>0)
        {
            System.out.println("number is positive");
        }
        else if(num<0)
        {
            System.out.println("number is negative");
        }
        s.close();
    }
}
