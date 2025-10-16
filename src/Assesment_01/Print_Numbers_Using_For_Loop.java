package Assesment_01;

import java.util.Scanner;

public class Print_Numbers_Using_For_Loop {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();

        for(int i=0;i<= num ; i++)
        {
            System.out.println(i);
        }
s.close();
    }
}
