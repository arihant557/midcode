

import java.sql.SQLOutput;
import java.util.Scanner;

public class uppstring
{
  String sd=" ";

    public static void main(String args[])
    {
        int count=0;
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        String[] strr = new String[size];
        for(int i=0; i<=size-1; i++) {
            strr[i] = s.nextLine();

        }
        for(int i=0; i<=size-1;i++)
        {
           //// count = strr[i].length();
          //  String first=strr[0];

            System.out.println(strr);
            //System.out.println(count);
        }
    }
}


