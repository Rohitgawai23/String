package String;
//16.enter a string by user and find the no of vowel and consonant using class and object.
import java.util.Scanner;


public class vowel_cons_class {
    // create instance variable
    Scanner sc;
    String s;
    int i,v=0,c=0;


    public void input()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        s=sc.nextLine();
    }

    public void display()
    {
        System.out.println("Count the no of Vowel and Consonent in String :");
        for( i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                v++;
            else
                c++;

        }
        System.out.println("   There are "+v+" vowels in a string");
        System.out.println("   There are "+c+" consonent in a string");
    }

    public static void main(String[] args) {
        vowel_cons_class ob=new vowel_cons_class();
        ob.input();
        ob.display();
    }
}
/*
Output :

        Enter the string :
        Rohit Niranjan Gawai
        Count the no of Vowel and Consonent in String :
        There are 8 vowels in a string
        There are 12 consonent in a string

 */
