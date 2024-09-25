import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int digitCount = countDigits(number);
        System.out.println("The number " + number + " has " + digitCount + " digits.");
    }

    public static int countDigits(int number) {
        int count = 0;

        // Handle the case where the number is 0
        if (number == 0) {
            return 1;
        }

        // Count the digits
        while (number != 0) {
            number /= 10;  // Remove the last digit from the number
            count++;
        }

        return count;
    }
}
