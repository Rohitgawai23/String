package String;
/*
11.Wap enter a string and find the count of:
        upper case
        lower case
        white space
*/

public class find_upper_lower_case {
    public static void main(String[] args) {

        String s="Java Program";
        int upper = 0,lower = 0,space =0;
        for(int i=0; i<s.length(); i++ )
        {
            char ch = s.charAt(i);

            if(ch>='A' && ch<='Z')
                upper++;
            else if(ch>='a' && ch<='z')
                lower++;
            else if(ch==' ')
                space++;
        }
        System.out.println("Lower case letter :"+lower);
        System.out.println("upper case letter :"+upper);
        System.out.println("Space :"+space);
    }
}
/*
Output :

        Lower case letter :9
        upper case letter :2
        Space :1

 */