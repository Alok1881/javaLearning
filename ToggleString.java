import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the string
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        sc.close();
        
        // Call the function to toggle the case of the string
        String toggledString = toggleCase(input);
        
        // Output the toggled string
        System.out.println("The string after toggling is: " + toggledString);
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is lowercase, convert to uppercase
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } 
            // Check if the character is uppercase, convert to lowercase
            else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } 
            // If it's neither (like a space or punctuation), leave it as is
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
        // Convert StringBuilder to string and return it
      
