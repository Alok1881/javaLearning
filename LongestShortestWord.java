import java.util.Scanner;

public class LongestShortestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        
        System.out.println("The words in descending order are:");
        descending(sentence);
    }

    public static void descending(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Initialize the longest and shortest words
        String longestWord = words[0];
        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Shortest word: " + shortestWord);
    }
}
