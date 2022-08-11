package String;
import java.util.*;
//3.enter a string by user and find its length
public class FindString_length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string :");
        String s=sc.nextLine();

        System.out.println("Length of string is :"+s.length());
    }
}
/*
Output :

        Enter the string :
        Rohit Gawai
        Length of string is :11

 */