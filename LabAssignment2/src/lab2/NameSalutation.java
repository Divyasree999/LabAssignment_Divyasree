package lab2;
/**
 * Description: Printing the Name Along with salutation
 * Author: Divyasree
 * Date:23-10-2020 
 */
public class NameSalutation {
    public static void main(String[] args)
    {
    	String arr[][]=new String[2][];
		arr[0]=new String[3];
		arr[1]=new String[5];
		arr[0][0]="Mr";
		arr[0][1]="Mrs";
		arr[0][2]="Miss";
		arr[1][0]="Prateek";
		arr[1][1]="Surya";
		arr[1][2]="Aiswarya";
		arr[1][3]="Rohan";
		arr[1][4]="Rakesh";
		System.out.println(arr[0][0]+". "+arr[1][0]);
		System.out.println(arr[0][2]+". "+arr[1][1]);
		System.out.println(arr[0][1]+". "+arr[1][2]);
		System.out.println(arr[0][0]+". "+arr[1][3]);
		System.out.println(arr[0][0]+". "+arr[1][4]);	 
	}
}
