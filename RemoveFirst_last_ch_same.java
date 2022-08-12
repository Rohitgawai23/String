package String_Ass_2Aug;
/*Q17. Write a Java program to read a given string and if the first or last characters are same
        return the string without those characters otherwise return the string unchanged.
        Sample Output:
        The given strings is: testcricket
        The new string is: estcricke   */

import java.util.Scanner;

public class RemoveFirst_last_ch_same {
    Scanner sc=new Scanner(System.in);
    String str;
    char ch[],temp;
    int i;

    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();
        ch=str.toCharArray();
    }

    public void logic()
    {
        System.out.println("The new string is :");
        for (i = 0; i < ch.length; i++)
        {
            if (ch[0] == ch[ch.length - 1])
            {
                for (i = 1; i < ch.length - 2; i++)
                {
                    System.out.print(ch[i]);
                }
            }

            else
                System.out.print(str);
                break;
        }
    }

    public static void main(String[] args) {
        RemoveFirst_last_ch_same R=new RemoveFirst_last_ch_same();
        R.input();
        R.logic();

    }
}
/*
Output :

        Enter the string :
        testcricket
        The new string is :
        estcricke

 */