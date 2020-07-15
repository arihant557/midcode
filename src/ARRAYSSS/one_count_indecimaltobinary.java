package ARRAYSSS;

import java.util.Scanner;

public class one_count_indecimaltobinary {
    public static void main(String[] args) {
        //4555---------------6 one
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        //int binnaryarray[] = new int[1000];
        int count = 0;
        int one = 0;
        while (number > 0)
        {
            one = number % 2;
            if (one == 1)
            {
                count++;
            }
            number = number / 2;

        }
        System.out.println(count);

    }
}

