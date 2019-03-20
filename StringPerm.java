import java.util.Scanner;

public class StringPerm
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        displayPermutation(s);
    }
    
    public static void displayPermutation(String s)
    {
        displayPermutation("", s);
    }
    
    public static void displayPermutation(String s1, String s2)
    {
        String s1SEdit = s1;
        String s2SEdit = s2;
        if(s2.length() > 0)
        {
            for(int i = 0; i < s2.length(); i++)
            {
                s1SEdit = s1 + s2.charAt(i);
                s2SEdit = s2.substring(0, i) + s2.substring(i + 1);
                displayPermutation(s1SEdit, s2SEdit);
            }
        }
        else
        {
            System.out.println(s1 + s2);
        }    
    }
}
