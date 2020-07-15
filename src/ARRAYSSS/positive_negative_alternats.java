package ARRAYSSS;


import java.util.Arrays;
import java.util.Scanner;

public class positive_negative_alternats
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] array = new int[size];
        for(int i=0; i<=array.length-1;i++)
        {
            array[i]=s.nextInt();

        }
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));

        int start=0;
        int end= array.length-1;

        int x=size-1;
        while(x>=0) {
            if(x>=0){
                System.out.println(array[start]);
                start++;
                x--;
            }
            if(x>=0) {
                System.out.println(array[end]);
                end--;
                x--;
            }
        }


    }



}
