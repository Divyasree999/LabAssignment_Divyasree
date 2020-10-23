package lab2;
import java.util.Scanner;
import java.util.Arrays;
/**
* <h1>Reversing and sorting of numbers from given set</h1>
* The ReverseSort program implements an application that
* simply reverse the numbers and gives the numbers in sorted manner in the given set of numbers and Prints
* the output on the screen.
*
* @author  Divya
* @date   23-10-2020
*/
public class ReverseSort
{
    public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
		int x[]=new int[5]; //Declaration and Initialization of array
		System.out.println("Enter array elements:"); //enter the elements
		for(int i=0;i<5;i++) 
		{
		    x[i]=s.nextInt();
		}
		ReverseSort obj=new ReverseSort();
		obj.revArray(x);
    }
	private void revArray(int[] x) {
        String str=Arrays.toString(x);
		Arrays.sort(x);
	    System.out.println("sorted array is:"+Arrays.toString(x));
	}
}
