
import java.lang.Integer;
import java.lang.Character;
import java.util.*;

public class DupChar {

  public  static void dupChar(String s)
    {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] a = s.toCharArray();
        for ( char c : a)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c, 1);
            }
        }
       System.out.println("Duplicate Characters: ");
        for (  Map.Entry<Character, Integer> i : map.entrySet() )
        {
            if( i.getValue() > 1)
                System.out.println( i.getKey() + " : " + i.getValue());
        }
    }
   static void dupWords(String s1[])
    {
        Map<String, Integer> map = new HashMap<>();
        System.out.println(" Duplicate Words : ");
        for( String i : s1 )
        {
            if( map.get(i) != null )
            {
                // increment duplicate one
                map.put( i, map.get(i)+1);
            }
            else
            {
                // if not Duplicate word, set to 1
                map.put( i , 1);
            }

        }

      for ( Map.Entry<String, Integer> i : map.entrySet() )
      {
          if( i.getValue() > 1)
           System.out.println( i.getKey() + "  " + i.getValue());
      }

    }
    public static void main(String[] args)
    {
      // Duplicate Characters Find
         String s = "narendravanka";
      // Static Functions we can  call directly
         dupChar(s);
      // Duplicate Words find  

         String a = "narendravanka is is a good guy Good guy yes he is so good";
         String []s1 = a.split(" ");
     // Static function
         dupWords(s1);
       
    }
}
