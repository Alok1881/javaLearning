import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueVowelsConsonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        // Call the function to print unique vowels and consonants
        printUniqueVowelsAndConsonants(input);
    }

    public static void printUniqueVowelsAndConsonants(String str) {
        Set<Character> vowels = new HashSet<>();
        Set<Character> consonants = new HashSet<>();

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {  // Check if the character is a letter
                if (isVowel(ch)) {
                    vowels.add(ch);  // Add to vowels set if it's a vowel
                } else {
                    consonants.add(ch);  // Add to consonants set if it's a consonant
                }
            }
        }

        // Print unique vowels
        System.out.println("Unique vowels in the string: " + vowels);
        // Print unique consonants
        System.out.println("Unique consonants in the string: " + consonants);
    }

    // Helper function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e'||ch=='i'||ch=='o'||ch=='u';
    }
}
