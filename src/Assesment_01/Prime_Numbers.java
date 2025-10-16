package Assesment_01;

public class Prime_Numbers {
    public static void main(String[] args) {
        //outer loop
        for(int i =2 ; i<=100 ; i++)
        {
            boolean isPrime = true;

            //inner loop
            for(int j=2 ;j * j <= i ;j++)
            {
                if(i%j == 0)
                {
                    isPrime=false; //if divisible by zero not prime number
                    break;
                }
            }

            if(isPrime)
            {
                System.out.print(i + " ");
            }
        }
    }
}
