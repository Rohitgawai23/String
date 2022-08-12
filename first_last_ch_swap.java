package String_2Aug;

import java.util.Scanner;

public class first_last_ch_swap {
    Scanner sc=new Scanner(System.in);
    String s1;
    char ch[];
    char  temp=0;

    public void input()
    {
        System.out.println("Enter String character");
        s1=sc.nextLine();
        ch=s1.toCharArray();       // covert character array string
    }

    public void logic()
    {
        System.out.println("Swap 1st and last character of string :");
        for (int i=0; i<ch.length; i++)
        {
            if (ch[0]!= ch[ch.length-1])
            {
                temp = ch[0];
                ch[0]=ch[ch.length-1];
                ch[ch.length-1] = temp;
                System.out.println(ch);
                break;
            }
            else
                System.out.print(" "+ch[i]);


        }
    }

    public static void main(String[] args) {
        first_last_ch_swap fl=new first_last_ch_swap();
        fl.input();
        fl.logic();
    }
}
/*
Output :

        Enter String character
        ROHIT
        Swap 1st and last character of string :
        T O H I R

 */