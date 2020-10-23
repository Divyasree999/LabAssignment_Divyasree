package lab2;
import java.util.Scanner;
import java.util.Arrays;
/**
* <h1>Removal of Duplicate from integers</h1>
* The RemoveDuplicate program implements an application that
* simply removes all the duplicate elements in the given set of integers and Prints
* the output on the screen.
*
* @author  Divya
* @date   23-10-2020
*/
public class RemoveDuplicate {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		//Declaration and Initialization of arrays
	    int[] a = new int[5];
	    int[] b = new int[5];
	    System.out.println("Enter the elements of the array ::");// Prints the elements that have given
	    for(int i=0; i<5; i++) 
	      {
	         a[i] = s.nextInt();
      	  }
	    System.out.println("The array created is ::"+Arrays.toString(a)); //Prints the array created
	      for(int i=0; i<5; i++) 
	      {
	         for (int j=0; j<5; j++) 
	         {
	        	 if(a[i]!=a[j])
	             {
	        		 b[i++]=a[i];
	             }
	         }
	      }
	      //Prints the elements after removing the elements
	     System.out.println("Array after removing elements ::"+Arrays.toString(b));
	 }
}
