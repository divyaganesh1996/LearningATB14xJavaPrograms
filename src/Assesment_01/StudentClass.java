package Assesment_01;

public class StudentClass {
    int rno;
    String name="";
    double marks;

    public  void display()
    {
        System.out.println("Row number :" + rno);
        System.out.println("Student name :" + name);
        System.out.println("Marks Obtained :" + marks);

    }
    public static void main(String[] args) {

        StudentClass s1 = new StudentClass();
        s1.rno=101;
        s1.name = "Divya";
        s1.marks = 60.6;
        System.out.println("s1 details:");
        s1.display();

        StudentClass s2 =new StudentClass();
        s2.rno=102;
        s2.name = "Mithran";
        s2.marks = 80;
        System.out.println("s2 details:");
        s2.display();

    }


}
