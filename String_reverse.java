package String;

public class String_reverse {
    public static void main(String[] args) {

        String s="Rohit Gawai";
        System.out.println("Given String is :"+s);
        System.out.println("----------------------------");

        System.out.println("--Reverse string :---");
        for(int i=s.length()-1; i>=0; i--)
        {
           System.out.print(s.charAt(i));
         }
    }
}
/*
Output :

        Given String is :Rohit Gawai
        ----------------------------
        --Reverse string :---
        iawaG tihoR

 */
