package String;
import java.util.*;
//4.enter a string by user and print its 1st and last character
public class printCharactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        char ch=s.charAt(0);

        System.out.println("1st Character is :"+ch);
        System.out.println("last character is :"+(s.charAt(s.length()-1)));

    }
}
/*
Output :

        Enter the String :
        Rohit Gawai
        1st Character is :R
        last character is :i

 */