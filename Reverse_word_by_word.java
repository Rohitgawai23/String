package String_Ass_2Aug;
/*
Q10.Wap enter a string and reverse it word by word.
        ex- my name is abc
        output- abc is name my
*/
import java.util.Scanner;

public class Reverse_word_by_word {
    Scanner sc=new Scanner(System.in);
    String str;
    String w[];
    String ans="";

    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();

    }

    public void logic()
    {
        w=str.split(" ");
        for (int i = w.length- 1; i >= 0; i--)
        {
            ans += w[i] + " ";
        }
        System.out.println("Reversed String:");
        System.out.println(ans.substring(0, ans.length() - 1));
    }

    public static void main(String[] args) {
        Reverse_word_by_word R=new Reverse_word_by_word();
        R.input();
        R.logic();

    }
}
/*
Output :

        Enter the string :
        i am java developer
        Reversed String:
        developer java am i

 */