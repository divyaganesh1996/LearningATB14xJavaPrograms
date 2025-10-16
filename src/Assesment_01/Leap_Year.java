package Assesment_01;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year");
        int year = s.nextInt();

if(IsLeapYear(year))
{
    System.out.println("it is leap year");
}
else if(!IsLeapYear(year))
{
    System.out.println("it is not leap year");
}

        s.close();
    }
    public static boolean IsLeapYear(int year)
    {
        return ((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0);
    }

}
