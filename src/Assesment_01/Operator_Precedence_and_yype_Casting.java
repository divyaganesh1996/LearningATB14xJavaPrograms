package Assesment_01;

public class Operator_Precedence_and_yype_Casting {
    public static void main(String[] args) {
        //precedence
        //BODMAS

        int a=20,b=12,c=30;

        int result = a+b*(c/b);
        System.out.println(result);

        boolean flag = false,status = true;

        boolean result1 = (flag && status) || (status && status);
        System.out.println(result1);

        //implicit casting

        int first = 12;
        long second = first;
        System.out.println(second);

        //explicit casting
        double myDouble = 23.09;
        float myFloat = (float) myDouble;
        System.out.println(myFloat);

    }
}
