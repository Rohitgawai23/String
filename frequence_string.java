package String_2Aug;

import java.util.Scanner;

public class frequence_string {
    Scanner sc = new Scanner(System.in);
    String s;
    char ch[];
    int i,j,c=0,lock=-1;

    public void input()
    {
        System.out.print("Enter String : ");
        s = sc.nextLine();
        ch = s.toCharArray();
    }
    int b[] = new int[10];

    public void logic()
    {
        for(i=0; i<ch.length; i++)
        {
            c=1;
            for(j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    c++;
                    b[j]=lock;
                }
            }
            if(b[i]!=lock)
                b[i]=c;
        }

        System.out.println("Frequency Of An Array: ");
        System.out.println("Character     Frequency");

        for(i=0; i<ch.length;i++)
        {
            if(b[i]!=lock)
                System.out.println(ch[i]+"\t\t "+b[i]);
        }
    }
    public static void main(String[] args) {
        frequence_string fs=new frequence_string();
        fs.input();
        fs.logic();
    }
}
/*
Output :

        Enter String : Codenera
        Frequency Of An Array:
        Character     Frequency
        C		 1
        o		 1
        d		 1
        e		 2
        n		 1
        r		 1
        a		 1


 */