import java.util.*;

public class TwoDArray {
    public static void main(String[] args)
    {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5),Arrays.asList(6,8));
        
        System.out.println( " Sum of 2D Array : " + fun(list));
    }
   public static int fun(List<List<Integer>> list)
   {
       int sum = 0;
        int[][] a = list.stream()
    .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
    .toArray(int[][]::new);

    for ( int i = 0;i< a.length; i++)
    {
        for ( int j = 0;j < a[i].length; j++ )
        {
            sum += a[i][j];
        }
    }
       return sum;
   }
}
