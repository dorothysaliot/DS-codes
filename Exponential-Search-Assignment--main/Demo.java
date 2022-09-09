/**
 * Saliot, Regine Joy Dorothy L. 
 * BS IT 2IT
 * - exponential search
 */

import java.util.Arrays;

public class Demo {
   public static void main(String args[]){
	  
	   
	   String[] arr = { "contribute", "geeks", "ide", "practice"};
       String x = "practice";
       int result = exponentialSearch(arr,arr.length, x);

       if (result == -1)
           System.out.println("Element not present");
       else
           System.out.println("Element found at "
                             + "index " + result);
      
   }
   
   
   
   

	   static int exponentialSearch(String array[],int n, String x)
	{
	// If x is present at first location itself
	if (array[0] == x)
	return 0;
	
	// Find range for binary search by
	// repeated doubling
	int i = 1;
	int res = x.compareTo(array[i]);
	while (i < n && array[i].indexOf(res)<= res)
	i = i*2;
	
	// Call binary search for the found range.
	return Arrays.binarySearch(array, i/2, Math.min(i, n), x);
	}
 
	
}