package String_2Aug;
//
import java.util.Scanner;

public class Delete_duplicate_ch {
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
        System.out.println("Character Frequency");

        for(i=0; i<ch.length;i++)
        {
            if(b[i]!=lock)
                System.out.println(ch[i]+"\t "+b[i]);
        }

        System.out.println("After deleting duplicate elements");
        for(i=0;i<ch.length;i++)
        {
            if(b[i]!=lock)
                System.out.print(ch[i]+" ");
        }
    }

    public static void main(String[] args) {
        Delete_duplicate_ch D=new Delete_duplicate_ch();
        D.input();
        D.logic();
    }
}
/*
Output :

        Enter String : Roshanan
        Frequency Of An Array:
        Character Frequency
        R	 1
        o	 1
        s	 1
        h	 1
        a	 2
        n	 2
        After deleting duplicate elements
        R o s h a n

 */