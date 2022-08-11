package String;
import java.util.Scanner;

// 7.Wap enter a string and print the character present at even position.
public class char_even_position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string :");
        String s=sc.nextLine();

        System.out.println("Character present at Even position are :");
        for(int i=0; i<s.length(); i++)
        {
            if(i%2==0)
                System.out.println(i+"\t"+s.charAt(i));

        }
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


 */