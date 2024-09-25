import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the base a
        System.out.print("Enter the base (a): ");
        int a = sc.nextInt();
        
        // Input the exponent n
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();
        
        sc.close();

        // Call the recursive function to compute a^n
        int result = power(a, n);
        
        // Output the result
        System.out.println(a + "^" + n + " = " + result);
    }

    public static int power(int a, int n) {
        // Base case: anything to the power of 0 is 1
        if (n == 0) {
            return 1;
        }
        
        // If n is negative, compute the power for positive n and then return the reciprocal
        if (n < 0) {
            return 1 / power(a, -n);  // For integer a and n, this will truncate the result to 0 for non-zero a.
        }
        
        // Recursive case: a^n = a * a^(n-1)
        return a * power(a, n - 1);
    }
}
