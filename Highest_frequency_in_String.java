package String_5Aug_Ass;

import java.util.Scanner;

//Q2.Write a Java program to find highest frequency character in a string.
public class Highest_frequency_in_String {
    Scanner sc=new Scanner(System.in);
    String str;
    int lock=-1;
    int temp[];
    int chara;

    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();
    }

    public void display()
    {
        int c=0;
        String a[]=str.split("");
        temp=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            c=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].equals(a[j]))
                {
                    temp[j]=lock;
                    c++;
                }
            }
            if(temp[i]!=lock)
                temp[i]=c;
        }

        int max=temp[0];
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>max)
            {
                max=temp[i];
                chara=i;
            }
        }
        System.out.println("Most Repeated character is: "+a[chara]);
    }
    public static void main(String[] args) {
        Highest_frequency_in_String H=new Highest_frequency_in_String();
        H.input();
        H.display();
    }
}
/*
Output :

        Enter the string :
        mynameisrohit
        Most Repeated character is: m

 */