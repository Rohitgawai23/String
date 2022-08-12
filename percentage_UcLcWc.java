package String_2Aug;
// Write a program enter the string find percentage of Lowercase, Uppercase and white space
import java.util.Scanner;

public class percentage_UcLcWc {
    Scanner sc=new Scanner(System.in);
    String str;
    char ch[];
    int i,per_u,per_l,per_w;
    int uc=0,lc=0,wc=0;

    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();
        ch=str.toCharArray();
    }
    public void logic()
    {
        for(i=0; i<ch.length; i++)
        {
            if(ch[i]>64 && ch[i]<95)
                uc++;
            else if(ch[i]>96 && ch[i]<122)
                lc++;
            else if(ch[i]==32)
                wc++;
        }
        per_u = (uc*100)/ch.length;
        per_l = (lc*100)/ch.length;
        per_w = (wc*100)/ch.length;

        System.out.println("Percentage of upper-case in a string is "+per_u+"%");
        System.out.println("Percentage of lower-case in a string is "+per_l+"%");
        System.out.println("Percentage of white space in a string is "+per_w+"%");
    }
    public static void main(String[] args) {
        percentage_UcLcWc p=new percentage_UcLcWc();
        p.input();
        p.logic();

    }
}
/*
Output :

        Enter the string :
        Rohit Gawai
        Percentage of upper-case in a string is 18%
        Percentage of lower-case in a string is 72%
        Percentage of white space in a string is 9%


 */