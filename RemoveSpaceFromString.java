import java.util.Scanner;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        str=str.replaceAll("\\s", "");
        System.out.println("String after space removal is:"+str);
    }
    
}
