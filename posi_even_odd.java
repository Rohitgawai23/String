package String;
import java.util.Scanner;

// 12.Wap enter a string and the character present at even and odd position individually using class and object.
public class posi_even_odd
{
    Scanner sc;
    String s;
    public void input()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        s=sc.nextLine();
    }
    public void display()
    {
        System.out.println("Character present at Even position are :");
        for(int i = 0; i<s.length(); i++)
        {
            if(i%2==0)
                System.out.println(i+"\t"+s.charAt(i));

        }
        System.out.println("Character present at Odd position are :");
        for(int i=0; i<s.length(); i++)
        {
            if(i%2!=0)
                System.out.println(i+"\t"+s.charAt(i));
        }
    }

    public static void main(String[] args) {
        posi_even_odd peo=new posi_even_odd();
        peo.input();
        peo.display();
    }
}
/*
Output :

        Enter the string :
        Rohit Gawai
        Character present at Even position are :
        0	R
        2	h
        4	t
        6	G
        8	w
        10	i
        Character present at Odd position are :
        1	o
        3	i
        5
        7	a
        9	a

 */