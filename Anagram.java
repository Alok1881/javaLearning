import java.util.Arrays;

public class Anagram {
    public static void main(String[] args)
    {
        String s1="Army";
        String s2="Mary";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length())
        {
        char[] charArrays1=s1.toCharArray();
        char[] charArrays2=s2.toCharArray();
        Arrays.sort(charArrays1);
        Arrays.sort(charArrays2);
        boolean result=Arrays.equals(charArrays1, charArrays2);
        if(result==true)
        {
            System.out.println("s1 and s2 are anagram");
        }
        else
        {
            System.out.println("s1 and s2 are not anagram");
        }
        }
    }
    
}
