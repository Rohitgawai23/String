package String_Ass_2Aug;
//Q6.Write a Java program to find last occurrence of a character in a given string.
import java.util.Scanner;

public class Occurrance_last_ch {
    Scanner sc=new Scanner(System.in);
    String str;
    char ch[];
    int i,c=0;

    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();
        ch=str.toCharArray();
    }
    public void logic()
    {
        System.out.println("last character in array :"+ch[(ch.length-1)]);
        for(i=0; i<ch.length; i++)
        {
            if(ch[ch.length-1]==ch[i])
                c++;
        }
        System.out.println("count the Last character occurrence :"+c);
    }
    public static void main(String[] args) {
        Occurrance_last_ch o=new Occurrance_last_ch();
        o.input();
        o.logic();
    }
}
 /*
Output :

        Enter the string :
        gawaigag
        last character in array :g
        count the Last character occurrence :3

  */