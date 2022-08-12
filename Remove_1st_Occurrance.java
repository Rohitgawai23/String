package String_5Aug_Ass;

import java.util.Scanner;

//Q5.Write a Java program to remove first occurrence of a character from string.
public class Remove_1st_Occurrance {
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
       System.out.println("after removing 1st occurence");
       char ch[]=str.toCharArray();

       for(int i=0; i<ch.length; i++)
       {
           if(str.charAt(0)!=ch[i])
           {
               System.out.print(ch[i]);
           }
       }

   }

    public static void main(String[] args) {
        Remove_1st_Occurrance R=new Remove_1st_Occurrance();
        R.input();
        R.logic();
  }
}

/*
Output :

        Enter the string :
        codecode
        after removing 1st occurence
        odeod

 */