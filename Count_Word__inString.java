import java.util.*;
public class Count_Word__inString {  

public static void main(String[] args)
{
    Scanner scn=new Scanner(System.in);
    String input=scn.nextLine();
    Map<String,Integer> testdata=new HashMap<>();
    String[] texts=input.split(" ");
    for(String word:texts)
    {
        Integer count=testdata.get(word);
        if(count==null)
        {
            testdata.put(word,1);
        }
        else
        testdata.put(word,count+1);
    }
    System.out.println(testdata);
}
}