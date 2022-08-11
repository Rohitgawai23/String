package String;
import java.util.*;
// 6.enter a string by user and search particular element are present or not
public class Search_char {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String :");
        String s=sc.nextLine();

        System.out.println("Enter the character to search :");
        char ch=sc.next().charAt(0);
        int count=0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==ch)
            {
                count++;
            }
        }
        if(count>0)
            System.out.println("Character found " +count+ " times ");
        else
            System.out.println("Character is not found");


    }
}
/*
Output :

        Enter the String :
        Rohit Gawai
        Enter the character to search :
        a
        Character found 2 times

 */