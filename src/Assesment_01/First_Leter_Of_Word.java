package Assesment_01;

public class First_Leter_Of_Word {
    public static void main(String[] args) {
        String text = "Hello Divya";
        String finaltext = GetFirstLetterFromWord(text);
        System.out.println(finaltext);
    }

    public static  String GetFirstLetterFromWord(String str) {
        StringBuffer result = new StringBuffer();
        boolean flag = true;//new word flag
        //char c;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                flag = true;
            } else if (flag) {
                 result.append(c);
                flag = false;
            }
        }

        return result.toString();
    }

    public static  String GetFirstLetterFromWord1(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" "); // Split by space
        for (String word : words) {
            if (!word.isEmpty()) { // Handle potential empty strings from multiple spaces
                result.append(word.charAt(0));
            }
        }
        return result.toString();
    }
}
