package String_Ass_2Aug;
// Q16.Wap enter a string and find the percentage of uppercase, lowercase, digits and special characters in a string
import java.util.Scanner;

public class perce_UcLcWc_dig_spicialCh_ {
    Scanner sc=new Scanner(System.in);
    String str;
    char ch[];
    int i,per_u,per_l,per_w,digit,spi_Ch;
    int uc=0,lc=0,wc=0,dig=0,spicialCh=0;

    public void input()
    {
        System.out.println("Enter the string :");
        str=sc.nextLine();
        ch=str.toCharArray();

    }
    public void logic()
    {
        for(i=0; i<ch.length; i++)
        {
            if(ch[i]>64 && ch[i]<95)
                uc++;
            else if(ch[i]>96 && ch[i]<122)
                lc++;
            else if(ch[i]==32)
                wc++;
            else if(ch[i]>48 && ch[i]<57)
                dig++;
            else if(ch[i]>33 && ch[i]<47 || ch[i]>58 && ch[i]<64 || ch[i]>91 && ch[i]<96 || ch[i]<123 && ch[i]>127)
                spicialCh++;


        }
        per_u = (uc*100)/ch.length;
        per_l = (lc*100)/ch.length;
        per_w = (wc*100)/ch.length;
        digit = (dig*100)/ch.length;
        spi_Ch =(spicialCh*100)/ch.length;


        System.out.println("Percentage of upper-case in a string is "+per_u+"%");
        System.out.println("Percentage of lower-case in a string is "+per_l+"%");
        System.out.println("Percentage of white space in a string is "+per_w+"%");
        System.out.println("Percentage of digit in a string is "+digit+"%");
        System.out.println("Percentage of special character in a string is "+spi_Ch+"%");


    }
    public static void main(String[] args) {
        perce_UcLcWc_dig_spicialCh_ p=new perce_UcLcWc_dig_spicialCh_();
        p.input();
        p.logic();
    }
}

/*
Output :

        Enter the string :
        Rohit @ Niranjan $ 123 Gawai
        Percentage of upper-case in a string is 10%
        Percentage of lower-case in a string is 53%
        Percentage of white space in a string is 17%
        Percentage of digit in a string is 10%
        Percentage of special character in a string is 3%

 */
