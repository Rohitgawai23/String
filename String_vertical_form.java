package String;
import java.util.Scanner;
// 5.enter a string by user and print it in vertical form
public class String_vertical_form {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String :");
        String s=sc.nextLine();

        System.out.println("Vertical form of string is :");
        for(int i=0; i<s.length(); i++)
        {
            System.out.println(i+"\t"+s.charAt(i));

        }

    }
}
/*
OutPut :

Enter the String :
Rohit Gawai
Vertical form of string is :
0	R
1	o
2	h
3	i
4	t
5
6	G
7	a
8	w
9	a
10	i


 */