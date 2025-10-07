package ex_10_For_Loop;

public class Lab93_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, Times : 50
            //            System.out.println(i);

            if (i == 5) {
                break;//it will exit from loop
            }
            System.out.println(i);
        }
    }
}
