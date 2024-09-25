import java.util.Scanner;

public class StringReversals {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String to reverse:");
        String str=scan.nextLine();
        System.out.println("Reverse of String is: " + reversal(str));
    }
    public static String reversal(String str)
    {
        char[] ch=str.toCharArray();
        String reverse="";
        for(int i=ch.length-1;i>=0;i--)
        {
            reverse+=ch[i];
        }
        return reverse.toString();
    }

    
}
