package Assesment_01;

import java.util.Scanner;

public class sumOfTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number for a");
        int a = scanner.nextInt();
        System.out.println("enter number for b");
        int b = scanner.nextInt();
        // Write your code here
        // int a=20,b=20;
        //System.out.println("sum of two number is :" + (a+b));//40
        //System.out.printf("sum of two number is :" , (a+b));//no output
        System.out.printf("sum of two number is :" + (a+b));
    }
}
