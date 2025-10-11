package Assesment_01;

public class Grade_Calculator {
    public static void main(String[] args) {
        int marks = 60;
        char grade=' ';
        /*if((marks >=90) && (marks<=100))
        {
            System.out.println("A");
        }
        else if((marks >=80) && (marks<=89))
        {
            System.out.println("B");
        }
        else if((marks >=70) && (marks<=79))
        {
            System.out.println("C");
        }
        else if((marks >=60) && (marks<=69))
        {
            System.out.println("D");
        }
        else if ((marks >=0) && (marks<=59))
        {
            System.out.println("F");
        }
*/
        if(marks >=90 && marks<=100) grade='A';
        else if(marks>=80 && marks<=89) grade='B';
        else if(marks>=70 && marks<=79) grade='C';
        else if(marks>=60 && marks<=69) grade='D';
        else if(marks<=59) grade='F';
        System.out.println("Grade of student is :" + grade);

    }
}
