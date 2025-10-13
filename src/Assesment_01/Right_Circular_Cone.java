package Assesment_01;

import java.util.Scanner;

public class Right_Circular_Cone {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of r:");
        double r = s.nextDouble();
        System.out.println("Enter the value of h:");
        double h = s.nextDouble();

        double v = (1.0/3.0)*Math.PI*Math.pow(r,2)*h;
        System.out.println(v);
        s.close();
    }
}
