package String_Ass_2Aug;
//Q1.Wap enter a string and replace any word with any new word.
import java.util.Scanner;

public class Replace_word {
    Scanner sc=new Scanner(System.in);
    String str,ch,repl;
    
    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();
    }
    public void display()
    {
        System.out.println("Enter the character which is to be replace : ");
        ch=sc.nextLine();
        System.out.println("Enter the character which is to be replace with :");
        repl=sc.nextLine();
        System.out.println("replace character is :\n\t"+str.replace(ch,repl));
    }
    public static void main(String[] args) {
        Replace_word Rw=new Replace_word();
        Rw.input();
        Rw.display();
    }
}
/*
Output :

       Enter the string :
       Rohit Niranjan Gawai
       Enter the character which is to be replace :
       Rohit
       Enter the character which is to be replace with :
       Gawai
       replace character is :
	        Gawai Niranjan Gawai


 */