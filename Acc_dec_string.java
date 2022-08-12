package String_Ass_2Aug;

import java.util.Scanner;

//Q13.Wap enter a string and sort each word of string in accending and descending order by the length of each word.
public class Acc_dec_string {
    Scanner sc=new Scanner(System.in);
    String str;
    String str_1[];


    public void input()
    {
        System.out.println("Enter the string :");
        str= sc.nextLine();
        str_1=str.split(" ");
    }

    public void Accending()
    {
        System.out.println("String in Ascending order is : ");
        for(int i=0; i<str_1.length; i++)
        {
            for(int j=i+1; j<str_1.length; j++)
            {
                if(str_1[i].length() > str_1[j].length())
                {
                   String k = str_1[j];
                    str_1[j] = str_1[i];
                    str_1[i] = k;
                }
            }
            System.out.print(str_1[i]+" ");
        }
        System.out.println();
    }

    public void Descending()
    {
        System.out.println("String in Descending order is : ");
        for(int i=0; i<str_1.length; i++)
        {
            for(int j=i+1; j<str_1.length; j++)
            {
                if(str_1[i].length() < str_1[j].length())
                {
                    String k = str_1[j];
                    str_1[j] = str_1[i];
                    str_1[i] = k;
                }
            }
            System.out.print(str_1[i]+" ");
        }
    }
    public static void main(String[] args) {
        Acc_dec_string ad=new Acc_dec_string();
        ad.input();
        ad.Accending();
        ad.Descending();
    }
}
/*
Output :

        Enter the string :
        developer java i am
        String in Ascending order is :
        i am java developer
        String in Descending order is :
        developer java am i

 */
