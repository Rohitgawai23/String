package String;

import java.util.Scanner;

//15.enter a string by user and search particular character are present or not if present find count
//        using class and object.
public class Search_ch_ {
    Scanner sc;
    String s;
    char ch;
    int count=0;
    public void input()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        s=sc.nextLine();

        System.out.println("Enter the character to search :");
        ch=sc.next().charAt(0);

    }

    public void display()
    {
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==ch)
            {
                count++;
            }
        }
        if(count>0)
            System.out.println("Character found " +count+ " times ");
        else
            System.out.println("Character is not found");

    }


    public static void main(String[] args) {
        Search_ch_ sc=new Search_ch_();
        sc.input();
        sc.display();
    }
}
/*
Output :

        Enter the String :
        Rohit Gawai
        Enter the character to search :
        a
        Character found 2 times

 */