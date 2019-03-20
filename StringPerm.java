public class StringPerm
{
    public static void main(String[] args)
    {
        String s = "abc";
        displayPermutation(s);
    }
    
    public static void displayPermutation(String s)
    {
        displayPermutation("", s);
    }
    
    public static void displayPermutation(String s1, String s2)
    {
        String s1Start = s1;
        if(s2.length() > 0)
        {
            System.out.println(s1 + s2);
            for(int i = 0; i < s2.length(); i++)
            {
                s1 = s1Start + s2.charAt(i);
                s2 = s2.substring(0, i) + s2.substring(i + 1);
                displayPermutation(s1, s2);
            }
        }
    }
}
