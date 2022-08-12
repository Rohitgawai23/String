package String_2Aug;
import java.util.Scanner;

public class Palindrome {
    String str;
    String rev="";
    int i;

    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        str=sc.nextLine();
    }

    public void logic()
    {
        System.out.println("Reverse string is :");
        for(i=str.length()-1; i>=0; i--)
        {
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println(str+ "\n\t It is palindrome string.");
        }
        else
            System.out.println(str+ "\n\t It is not a palindrome string.");

    }
    public static void main(String[] args) {
        Palindrome p=new String_2Aug.Palindrome();
        p.input();
        p.logic();
    }
}
/*
Output  :

        Enter the string :
        level
        Reverse string is :
        level
        It is palindrome string.

 */