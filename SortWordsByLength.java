import java.util.Arrays;
import java.util.Comparator;

public class SortWordsByLength {
    public static void main(String[] args) {
        String sentence = "enphase energy on renewable";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Sort the words in descending order based on their length
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return Integer.compare(word2.length(), word1.length());
            }
        });

        // Print the words in descending order
        System.out.println("Words sorted by length in descending order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
