package String_Ass_2Aug;

import java.util.Scanner;

//Q2. Write a Java program to enter a string and reverse each character.
public class Reverse_each_char {
    Scanner sc=new Scanner(System.in);
    String str;
    int i;

    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();
    }

    public void dispaly()
    {
        System.out.println("Reverse string :");
        for(i=str.length()-1; i>=0; i--)
        {
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Reverse_each_char R=new Reverse_each_char();
        R.input();
        R.dispaly();

    }
}
/*
Output :

        Enter the string :
        Rohit Gawai
        Reverse string :
        iawaG tihoR

 */