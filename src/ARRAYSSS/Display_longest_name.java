package ARRAYSSS;


import java.util.Scanner;

public class Display_longest_name
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        String count= " ";
        int size = s.nextInt();
        String array[] = new String[size];
        for(int i=0; i<=array.length-1; i++)
        {
            array[i]= s.next();

        }
        for(int j=0; j<array.length-1; j++)
        {
            count= String.valueOf(array.length);


        }

    }

}

