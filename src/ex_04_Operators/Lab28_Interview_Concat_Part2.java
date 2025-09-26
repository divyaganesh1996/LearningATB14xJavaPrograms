package ex_04_Operators;

public class Lab28_Interview_Concat_Part2 {
    public static void main(String[] args) {
        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);//PramodDutta1010
        System.out.println(a + b + first_name + last_name);//20PramodDutta

        //         // BODMAS - Bracket of Div, mul, add, sub
        System.out.println(first_name + last_name + (a + b));//PramodDutta20
    }
}
