package String_Ass_2Aug;
//Q12.Wap enter a string and print only those word which is start from vowel.
import java.util.Scanner;

public class Start_form_vowel {
    Scanner sc=new Scanner(System.in);
    String str;
    String word[];
    int i;
    char []ch;

    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();
        ch=str.toCharArray();
    }
    public void logic()
    {
        word=str.split(" ");
        System.out.println("word which is start from vowel : ");
        for(i=0; i< word.length; i++)
        {
            if(word[i].startsWith("A") || word[i].startsWith("E") || word[i].startsWith("I") || word[i].startsWith("O") || word[i].startsWith("U") || word[i].startsWith("a") ||
                    word[i].startsWith("e") ||word[i].startsWith("i") ||word[i].startsWith("o") || word[i].startsWith("u") )
                System.out.println(word[i]+" ");
        }

    }
    public static void main(String[] args) {
        Start_form_vowel S=new Start_form_vowel();
        S.input();
        S.logic();
    }
}
/*
Output :

        Enter the string :
        I own an Apple xiaomi, it runs fast
        word which is start from vowel :
        I
        own
        an
        Apple
        it

 */
