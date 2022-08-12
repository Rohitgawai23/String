package String_5Aug_Ass;
import java.util.Scanner;
//Q3.Write a Java program to find lowest frequency character in a string.
public class Lowest_frequency_in_string {

Scanner sc=new Scanner(System.in);
String str;
int lock=-1;
int temp[];
int chara;

    public void input()
    {
        System.out.println("Enter the String :");
        str=sc.nextLine();
    }

    public void logic()
    {
        int c=0;
        String a[]=str.split("");
        temp=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            c=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].equals(a[j]))
                {
                    temp[j]=lock;
                    c++;
                }
            }
            if(temp[i]!=lock)
                temp[i]=c;
        }

        int min=temp[0];
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]==1)
            {
                chara=i;
                break;
            }
            if(temp[i]!=lock&&temp[i]<min)
            {
                min=temp[i];
                chara=i;
            }
        }
        System.out.println("Lowest Repeated character is: "+a[chara]);
    }
    public static void main(String[] args) {
        Lowest_frequency_in_string L=new Lowest_frequency_in_string();
        L.input();
        L.logic();
    }
}
/*
output :

        Enter the String :
        rohitniranjangawai
        Lowest Repeated character is: o

 */