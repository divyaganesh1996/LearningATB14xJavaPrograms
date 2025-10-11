package Assesment_01;

import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operator(+,-,*,/) :");
        char operator = scanner.next().charAt(0);

        System.out.println("enter the number");
        double num1 = scanner.nextInt();

        System.out.println("enter the number");
        double num2 = scanner.nextInt();

        switch (operator)
        {
            case '+':
                System.out.println(num1 + num2);
                break;

            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("enter any operator");
                break;
        }
scanner.close();

    }
}
