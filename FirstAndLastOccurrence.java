import java.util.Scanner;

public class FirstAndLastOccurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the element to find
        System.out.print("Enter the element to find: ");
        int x = sc.nextInt();

        sc.close();

        // Find the first and last occurrence
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (firstIndex == -1) {
                    firstIndex = i + 1; // Adding 1 for one-indexing
                }
                lastIndex = i + 1; // Update lastIndex every time x is found
            }
        }

        if (firstIndex != -1) {
            System.out.println("First occurrence of " + x + " is at index: " + firstIndex);
            System.out.println("Last occurrence of " + x + " is at index: " + lastIndex);
        } else {
            System.out.println(x + " is not present in the array.");
        }
    }
}
