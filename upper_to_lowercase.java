package String;

import java.util.Scanner;

public class upper_to_lowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string :");
        String s=sc.nextLine();


        System.out.println("lower case string : "+s.toLowerCase());
    }
}
