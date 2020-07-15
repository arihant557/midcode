package ARRAYSSS;


import java.util.Scanner;

public class one_gap_count_in_DtoB
{
    public static void main(String[] args)
    {
        //564--------3,-1,1, 0or1
        Scanner s =  new Scanner(System.in);
        int number = s.nextInt();
        int count=0;
        int zero=0;
        int a=0;

        int binary[] = new int[1000];

        while(number>0)
        {
            zero=number%2;
            //System.out.println("the"+" "+zero);
            if(zero==0)
            {
                binary[a]= count++;
                //  System.out.println("array"+" "+ binary[count]);
            }
            number=number/2;
            //number=number/10;
        }
        for(int i=count-1;i>0;i--)
        {
            System.out.println(count);
        }
    }
}

