package lab2;
/**
* <h1>Finding of Second Smallest Number</h1>
* The SecondSmallest program implements an application that
* simply finds the second smallest number in the given set of numbers and Prints
* the output on the screen.
*
* @author  Divya
* @date   23-10-2020
*/
public class SecondSmallest {
	//Declaration of array
	public static int getSecondSmallest(int[] array, int total) {
		//Declaration of Variables
		int temp; 
		for( int i=0; i<total; i++) 
		{
			for(int j=i+1; j<total; j++) 
			{
				if(array[i] > array[j]) 
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[1];
	}
	public static void main(String[] args) {
		//Initialization of values to an Array 
		int array[] = {29, 33, 17, 93, 67};
		// Prints Second smallest number in given numbers : on standard output
		System.out.println("Second Smallest number in given numbers : "+getSecondSmallest(array, 5));

	}

}
