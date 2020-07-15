package ARRAYSSS;

import java.util.*;
import java.lang.*;
import java.io.*;

public class arraysum {

    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int sum=0;

        int array[] = new int[a];
        for(int i=0; i<array.length;i++)
        {
            array[i]=s.nextInt();
        }

        for(int i=0;i<array.length;i++)
        {
            sum=array[i]+sum;
            //System.out.println(array[i]);
        }
        System.out.println(sum);



    }
}


