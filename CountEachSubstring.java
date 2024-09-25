import java.util.*;
public class CountEachSubstring{
public static void main(String[] args)
{
    String wordss="A Friend in need is a Friend indeed";
    Map<String ,Integer> hash=new HashMap<>();
    String[] words=wordss.split(" ");

    for(String word:words)
    {
        Integer Count=hash.get(word);
        if(Count==null)
        {
            hash.put(word,1);
        }
        else
        {
            hash.put(word,Count+1);
        }
  
    }
    System.out.println(hash);
}
}