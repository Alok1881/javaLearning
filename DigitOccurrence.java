import java.util.Scanner;

public class DigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number N
        System.out.print("Enter the number N: ");
        int N = sc.nextInt();
        
        // Input the digit D
        System.out.print("Enter the digit D: ");
        int D = sc.nextInt();
        
        sc.close();

        // Call the function to count occurrences of digit D in number N
        int occurrenceCount = countDigitOccurrences(N, D);
        
        // Output the result
        System.out.println("The digit " + D + " occurs " + occurrenceCount + " times in the number " + N + ".");
    }

    public static int countDigitOccurrences(int N, int D) {
        int count = 0;
        int currentDigit;
        
        // If the number N is negative, make it positive
        if (N < 0) {
            N = -N;
        }

        // Loop through the digits of N
        while (N > 0) {
            currentDigit = N % 10; // Extract the last digit
            if (currentDigit == D) {
                count++;
            }
            N /= 10; // Remove the last digit from N
        }

        return count;
    }
}
