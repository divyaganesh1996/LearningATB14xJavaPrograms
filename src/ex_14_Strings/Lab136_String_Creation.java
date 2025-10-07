package ex_14_Strings;

public class Lab136_String_Creation {
    public static void main(String[] args) {
        String s1 = "Divya";
        String s2 = new String("Divya");
        String s3 = "Divya";
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true
        System.out.println(s1.equals(s2));//true
    }
}
