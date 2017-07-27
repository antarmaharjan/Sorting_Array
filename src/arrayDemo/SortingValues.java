package arrayDemo;
import java.util.Arrays;

public class SortingValues {
	
	
	public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		//Display the original (unsorted values)
		System.out.print("Before sorting:");
		
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );    
	     
	
			
		//It sorts in ascending order by default
			Arrays.sort(arr);
		 
        System.out.printf("\nAfter sorting: %s",
            Arrays.toString(arr));
	}
}
	


