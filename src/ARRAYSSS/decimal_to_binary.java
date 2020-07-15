package ARRAYSSS;

import java.util.Scanner;

public class decimal_to_binary
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int number = s.nextInt();
        //234
        int binaryarray[]=new int[1000];
        int count=0;
        while(number>0)
        {
            binaryarray[count] = number%2;
            number = number/2;
            count++;
        }
        for(int i=count-1;i>0;i--)
        {
            System.out.println(binaryarray[i]);
        }
    }

}

