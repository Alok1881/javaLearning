
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
public class practice {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter size of array:");
int k=scan.nextInt();
int[] num=new int[k];
System.out.println("Enter array elements:");
for(int i=0;i<k;i++)
{
  num[i]=scan.nextInt();
}
swap(num);
System.out.println("new array elements are:" );
for(int i=0;i<k;i++)
{
  System.out.print(num[i]+" ");
}
}
public static void swap(int[] num)
{
  int temp=num[0];
  num[0]=num[num.length-1];
  num[num.length-1]=temp;
}
}
