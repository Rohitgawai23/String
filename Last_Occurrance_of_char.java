package String_5Aug_Ass;

import java.util.Scanner;

//Q1.Write a Java program to find last occurrence of a character in a given string.
public class Last_Occurrance_of_char {
 Scanner sc=new Scanner(System.in);
 String str;


    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();

    }

    public void LastOccurranceChar()
    {

        int c=0;
        char a[]=str.toCharArray();     // It convert array into string
        for(int i=0; i<a.length; i++)
        {
            if(a[a.length-1]==a[i])
            {
                c++;
            }
        }
        System.out.println("last occurrence of a character in a given string :\n"+c);

    }
    public static void main(String[] args) {
        Last_Occurrance_of_char l=new Last_Occurrance_of_char();
        l.input();
        l.LastOccurranceChar();
    }
}
/*
output :

        Enter the string :
        cadenera
        last occurrence of a character in a given string :
        2


 */