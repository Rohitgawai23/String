package String_Ass_2Aug;

import java.util.Scanner;

/*Q18. Write a Java program to create a new string repeating every character twice of a
        given string.
        Sample Output:
        The given string is: welcome
        The new string is: wweellccoommee
  */
public class Repeating_every_char {
    Scanner sc=new Scanner(System.in);
    String str;
    char ch[];
    char temp;
    int i,j,k=0;

    public void input()
    {
        System.out.println("Enter the string");
        str=sc.nextLine();

    }

    public void logic()
    {
        ch=str.toCharArray();
        char []temp=new char[ch.length*2];
        System.out.println("Repeating every character twice of a given string.");
        for(i=0; i<ch.length; i++)
        {
            for(j=0; j<2; j++)
            {

                temp[k] = ch[i];
                k++;
            }
        }
        for(i=0; i< temp.length; i++)
            System.out.print(temp[i]);
    }
    public static void main(String[] args) {
        Repeating_every_char R=new Repeating_every_char();
        R.input();
        R.logic();
    }
}

/*
 output :

         Enter the string
         welcome
         Repeating every character twice of a given string.
         wweellccoommee

 */