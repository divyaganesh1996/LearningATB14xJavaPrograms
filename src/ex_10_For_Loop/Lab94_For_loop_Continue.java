package ex_10_For_Loop;

public class Lab94_For_loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                continue;//only 5 will be excluded and all other values will be printed
            }
            System.out.println(i);

        }
    }
}
