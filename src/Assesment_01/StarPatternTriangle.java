package Assesment_01;

public class StarPatternTriangle {
    public static void main(String[] args) {
       int rows=5;

       //right angle tringle
        for(int a = 1; a<= rows ; a++)
        {
            for(int b=1 ; b<= a ; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------");

       //inverted right angle trinagle
        for(int a = 1; a<= rows ; a++)
        {
            for(int b=a ; b<= rows ; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------");

       //pyramid
       for(int i=1;i<=rows;i++)
       {
           for(int j=i;j<rows;j++)
           {
               System.out.print(" ");
           }
           for(int k=1;k<=(2*i-1);k++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
