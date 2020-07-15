package ARRAYSSS;

import java.util.Scanner;

public class print_element_call {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0; i<=array.length-1; i++)
        {
            array[i]=s.nextInt();
        }
        int call = s.nextInt();
        System.out.println(array[call]);
    }
}

