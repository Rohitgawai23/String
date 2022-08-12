package String_Ass_2Aug;
import java.util.Scanner;
/*
Q14. Write a Java program to create a new string from a given string swapping the last two
        characters of the given string. The length of the given string must be two or more.
        Sample Output:
        The given strings is: string
        The string after swap last two characters are: strign
*/
public class Swap_last2_cp {
    Scanner sc=new Scanner(System.in);
    String str;
    char ch[];
    char temp;
    int i;

    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();
        ch=str.toCharArray();
    }

    public void swap()
    {
        System.out.println("After swapping the string of last 2 character :");
        for(i=0; i< ch.length; i++)
        {
            if(ch[ch.length-2]!=ch[ch.length-1])
            {
                temp =ch[4];
                ch[4]=ch[ch.length-1];
                ch[ch.length-1]=temp;
                System.out.println(ch);
                break;
            }
            else
                System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Swap_last2_cp s=new Swap_last2_cp();
        s.input();
        s.swap();
    }
}
/*
Output :

        Enter the string :
        String
        After swapping the string of last 2 character :
        Strign


 */
