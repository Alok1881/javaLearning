import java.util.Scanner;

public static void main(String[] args) {
    Scanner Sscn=new Scanner(System.in);
    System.out.println("enter string to reverse");
    String input=Sscn.nextLine();
    StringBuilder s=new StringBuilder(input);
    System.out.println(s.reverse().toString());

}