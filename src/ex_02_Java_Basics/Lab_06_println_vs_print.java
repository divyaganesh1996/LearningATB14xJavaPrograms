package ex_02_Java_Basics;

public class Lab_06_println_vs_print {
    public static void main(String[] args) {
        System.out.print("hello");
        System.out.println("hi"); // hellohi

        System.out.println("hello");//hello
        System.out.println("hi");//hi


        System.out.println("1");//1
        System.out.print("2");//1
        //2Disconnected from the target VM, address: '127.0.0.1:56062', transport: 'socket'
        System.out.print("3");
        System.out.print("4");//34
    }
}
