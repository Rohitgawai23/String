package String_Ass_2Aug;
//Q4.Write a Java program to find last occurrence of a word in a given string.
import java.util.Scanner;

public class Last_occurrance {
    Scanner sc=new Scanner(System.in);
    String str;
    String w[];
    char ch[];
    int c=0;

    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();
    }

    public void display()
    {
        w=str.split(" ");
        System.out.println("last word is :\n\t"+w[w.length-1]);
        for(int i=0; i< w.length; i++)
        {
            System.out.println(i+"\t"+w[i]);
            if(w[w.length-1].equals(w[i]))
            {
                c++;
            }

        }
        System.out.println("occurrence of last  word :"+c);
    }

    public static void main(String[] args) {
        Last_occurrance L=new Last_occurrance();
        L.input();
        L.display();
    }
}
/*
Output :

        Enter the string :
        Rohit gawai java gawai
        last word is :
        gawai
        0	Rohit
        1	gawai
        2	java
        3	gawai
        occurrence of last  word :2


 */
