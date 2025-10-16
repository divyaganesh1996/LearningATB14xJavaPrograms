package Assesment_01;

public class MultiplicationTables {
    public static void main(String[] args) {

        //outer loop
        for(int i=1 ; i <=5 ; i++)
        {
            System.out.println("multiplication of" + i + ":");
            System.out.println("................");

            //inner loop
            for (int j= 1 ; j<= 10 ; j++)
            {
                System.out.printf("%d * %d = %d%n", i , j ,(i*j));
            }
            System.out.println();
        }

    }
}
