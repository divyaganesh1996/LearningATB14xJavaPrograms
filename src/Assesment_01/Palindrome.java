package Assesment_01;

public class Palindrome {
    public static void main(String[] args) {

        String text = "boss";
        String rev="";
        for(int i=text.length()-1 ;i>=0;i--)
        {
            rev += text.charAt(i);
        }
        //System.out.println(rev);

        if(rev == text)
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }


       /* StringBuffer buffer = new StringBuffer("mam");
        System.out.println(buffer.reverse());*/
    }
}
