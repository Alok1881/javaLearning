import java.util.Scanner;

public class CommonPrefix {
    public static void main(String[] args) {
        // Example string array
        String[] strArray = {"goofy", "goo", "gooz", "goook", "goozer"};

        // Find and print the longest common prefix
        String commonPrefix = findCommonPrefix(strArray);
        System.out.println("The longest common prefix is: " + commonPrefix);
    }

    public static String findCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first word as a reference for comparison
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Compare the current prefix with each word in the array
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix length until it matches the beginning of the current word
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
