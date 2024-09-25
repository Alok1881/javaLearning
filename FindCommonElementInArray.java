import java.util.ArrayList;
import java.util.List;

public class FindCommonElementInArray {
    public static void main(String[] args)
    {
        int arr1[]={1,2,3,4};
        int arr2[]={2,5,6,8};
        List<Integer> commonElement=new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if (arr1[i]==arr2[j])
                {
                    commonElement.add(arr1[i]);
                }
            }
        }
        System.out.println(commonElement);
    }
    
}
