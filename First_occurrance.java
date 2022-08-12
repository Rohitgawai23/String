package String_Ass_2Aug;
import java.util.Scanner;

//Q3.Write a Java program to find first occurrence of a word in a given string.
public class First_occurrance {
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
        System.out.println("first word is :\n\t"+w[0]);
        for(int i=0; i< w.length; i++)
        {
            System.out.println(i+"\t"+w[i]);
            if(w[0].equals(w[i]))
            {
                c++;
            }

        }
        System.out.println("occurrence of first word :"+c);
    }


    public static void main(String[] args) {
        First_occurrance F=new First_occurrance();
        F.input();
        F.display();
    }
}
/*
Output :

        Enter the string :
        Rohit Niranjan Gawai Rohit codenera
        first word is :
        Rohit
        0	Rohit
        1	Niranjan
        2	Gawai
        3	Rohit
        4	codenera
        occurrence of first word :2

 */