import java.util.Scanner;

public class CountSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        System.out.println("Enter substring:");
        String sub = sc.nextLine();

        System.out.println("count of substring:" + sub + " in a string is:" + countOfSubstring(str, sub));
    }

    public static int countOfSubstring(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }

}
