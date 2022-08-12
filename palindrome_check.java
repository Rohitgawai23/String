package String_Ass_2Aug;
//Q9.Wap enter a string and check it is palindrome or not.
import java.util.Scanner;

public class palindrome_check {
    String str;
    String rev="";
    int i;

    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        str=sc.nextLine();
    }
    public void display()
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
        palindrome_check p=new palindrome_check();
        p.input();
        p.display();
    }
}
/*
Output :

        Enter the string :
        rabar
        Reverse string is :
        rabar
        It is palindrome string.


 */