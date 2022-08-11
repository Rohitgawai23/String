package String;
import java.util.Scanner;

// 8.Wap enter a string and print the character present at odd position.
public class char_odd_position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String :");
        String s=sc.nextLine();

        System.out.println("Character present at Odd position");
        for(int i=0; i<s.length(); i++)
        {
            if(i%2!=0)
                System.out.println(i+"\t"+s.charAt(i));
        }

    }
}
/*
Output :

        Enter the String :
        Rohit Gawai
        Character present at Odd position
        1	o
        3	i
        5
        7	a
        9	a

 */