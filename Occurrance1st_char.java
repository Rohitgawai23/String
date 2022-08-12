package String_Ass_2Aug;
//Q5.Write a Java program to find first occurrence of a character in a given string
import java.util.Scanner;

public class Occurrance1st_char {
    Scanner sc=new Scanner(System.in);
    String str;
    char ch[];
    int i;
    int c=0;

    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();
        ch =str.toCharArray();
    }
    public void display()
    {
        System.out.println("first character in array :"+ch[0]);
        for(i=0; i<ch.length; i++)
        {
            if(ch[0]==ch[i])
                c++;
        }
        System.out.println("count the first character occurrence :"+c);
    }
    public static void main(String[] args) {
        Occurrance1st_char O=new Occurrance1st_char();
        O.input();
        O.display();
    }
}
/*
Output :

      Enter the string :
      RohitRg
      first character in array :R
      count the first character occurrence :2

 */
