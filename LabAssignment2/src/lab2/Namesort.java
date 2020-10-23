/*package lab2;
import java.util.Arrays;
public class NameSort {
	public String sortStrings(String array) {
		char charArray[] = array.toCharArray();
		Arrays.sort(charArray);
		return String(charArray);
	}
} */
package lab2;
import java.util.Scanner;
import java.util.Arrays;
/**
* <h1>Sorting of elements in alphabetical order</h1>
* The NameSort program implements an application that
* simply sorts elements in the left half be in Uppercase 
* and in right half be in Lowecase in the given set of names and Prints
* the output on the screen.
*
* @author  Divya
* @date   23-10-2020
*/
public class Namesort 
{
    public static void main(String[] args)
	{
    	//Declaration and Initialization of names
		String[] names = new String[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the names: ");
		for (int i=0;i<((names.length/2)+1 );i++ )
		{
			names[i] = s.next();
		}
		for(int i=((names.length/2)+1 );i<names.length;i++) 
		{
			names[i]=s.next();
	    }
		Arrays.sort(names);
		for (int i=0;i<names.length ;i++) 
		{
			//Prints the names in sorted manner
			System.out.println("Name are " + names[i]);
		}
	}
}
