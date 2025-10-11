package Assesment_01;

public class SecondMaxNumberInArray {
    public static void main(String[] args) {
        int[] array = {12,20,100,34,89,45,66};
        int temp;
        for(int i=0;i<array.length;i++)
        {
             for(int j=i+1;j<array.length;j++)
             {
                 if(array[i]>array[j]) {
                     temp = array[i];
                     array[i] = array[j];
                     array[j] = temp;
                 }
             }
        }
        System.out.println(array[array.length-2]);
    }
}
