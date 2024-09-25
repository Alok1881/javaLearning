import java.util.Scanner;

public class SwapFirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        System.out.println("first and last character is swapped:" + palindromeCheck(str));
    }

    public static String palindromeCheck(String str) {
        int lengths = str.length();

        char[] ch = str.toCharArray();
        char temp = ch[lengths - 1];
        ch[lengths - 1] = ch[0];
        ch[0] = temp;

        return new String(ch);
    }
}
