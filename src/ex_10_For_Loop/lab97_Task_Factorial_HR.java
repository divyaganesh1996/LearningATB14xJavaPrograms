package ex_10_For_Loop;

import java.util.Scanner;

public class lab97_Task_Factorial_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        int fact = 1;

        if(num ==0)
        {
            fact = 1;
        }

        for (int i =1 ; i <= num ; i ++){
            fact *= i;
        }

        System.out.println(fact);

    }
}
