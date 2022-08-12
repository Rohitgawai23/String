
package String_5Aug_Ass;
//Q6.Write a Java program to remove last occurrence of a character from string.
import java.util.Scanner;

public class Remove_last_Occurrance {
    Scanner sc=new Scanner(System.in);
    String str;
    char ch;

    public void input()
    {
        System.out.println("Enter the string :");
        str= sc.nextLine();
    }
    public void logic()
    {
        System.out.println("after removing Last occurence :");
        char ch[]=str.toCharArray();

        for(int i=0; i<ch.length; i++)
        {
            if(str.charAt(ch.length-1)!=ch[i])
            {
                System.out.print(ch[i]);
            }
        }
    }
    public static void main(String[] args) {
        Remove_last_Occurrance R=new Remove_last_Occurrance();
        R.input();
        R.logic();
    }
}


/*
Output :

        Enter the string :
        Occurrence
        after removing Last occurence :
        Occurrnc

 */