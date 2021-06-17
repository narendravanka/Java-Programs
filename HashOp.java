import java.util.*;
public class HashOp {
   
  static  int hash[] = new int[100];
   // Time Complexity O(N) = Size of Elements
   public static void hashFrequency ( int a[]) {
     
      int n = a.length;
     // if given Array input Numbers can not exceed Length of Array
     // int hash[] = new int[n]; 
    
     Arrays.fill(hash, 0);   
    for ( int i=0; i < n ; i++)
        hash[a[i] ]++;
    // if number is 5, [a[5]] = [6] = h[6] = 0++ => h[5] = 1
    //if number is 4,  [a[2]] = [4] = h[4] = 0++ => h[3] = 1
    // if number is 2 at 3 index a[3] = h[2]  = 1++ => h[2] = 2 Incremented
    System.out.println(" Frequencies with Order (N): ");
    int i = 0;
    // starts from Hash index table 1 element
    while ( i++ < n )
        System.out.println( (i) + " = " + hash[i]);
  }

    public static void hashSerach( int key)
    {
        if( hash[key] >= 1)
            System.out.println ( "  => " + key + " Elemnet Found : " );
        else
            System.out.println ( "  => " + key + " Not Found:");
    }
    public static void main( String []args)

    {
        // enter elements from 1 - array.length only for better 
        int a[] = { 2,3,4,2,5,6,6,7,6,8,6,6,6,6,11,15};
        hashFrequency(a);
        // O(1) time complexity for Searching 
        hashSerach(4);
    }
 
}
