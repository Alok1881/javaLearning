import java.util.HashMap;
import java.util.Map;

public class NonDuplicateCharacters {

    public static void main(String[] args) {
        String str = "programming";

        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character counts: " + charCount);

        // Print non-duplicate characters
        System.out.print("Non-duplicate characters in \"" + str + "\": ");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
