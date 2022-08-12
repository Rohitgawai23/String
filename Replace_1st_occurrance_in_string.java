package String_5Aug_Ass;

import java.util.Scanner;

//Q8.Write a Java program to replace first occurrence of a character with another in a string.
public class Replace_1st_occurrance_in_string {
    Scanner sc=new Scanner(System.in);
    String str;
    char a[];

    public void input()
    {
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        char a[]=str.toCharArray();
    }

    public void logic()
    {

        for(int i=0; i<a.length; i++)
        {
            if(a[0]==a[i])
            {
                a[0]=0;
            }
        }

        for(int i=0; i<a.length; i++)
        {
            if(a[i]!=0)
            {
                System.out.print(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        Replace_1st_occurrance_in_string R=new Replace_1st_occurrance_in_string();
        R.input();
        R.logic();
    }
}
