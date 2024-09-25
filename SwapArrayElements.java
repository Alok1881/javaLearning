import java.util.Scanner;

public class SwapArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Swap the first and last elements
        swapFirstAndLast(arr);

        System.out.println("Array after swapping the first and last elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swapFirstAndLast(int[] arr) {
        if (arr.length < 2) {
            return; // No need to swap if the array has less than 2 elements
        }
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }
}
