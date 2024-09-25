import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElementMinHeap {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of array elemets:");
        int k=scan.nextInt();
        System.out.println("Enter the position of the largest element in an array:");
        int k1=scan.nextInt();
        int[] num=new int[k];
        System.out.println("Enter array elements:");
        for(int i=0;i<k;i++)
        {
            num[i]=scan.nextInt();
        }
        System.out.println(k1+"th largest element is: "+kthLargestElement(num,k1));
    }
    public static int kthLargestElement(int[] num,int k1)
    {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        int kthLargest=-1;
        for(int i:num)
        {
            heap.offer(i);
            if(heap.size()>=k1)
            {
                kthLargest=heap.poll();
            }
        }
        return kthLargest;
    }
    
}
