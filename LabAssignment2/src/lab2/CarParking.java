package lab2;
import java.util.Scanner;

/**
 * Description: Entry of Car Info and check for Available Space.
 * Author: Divyasree
 * Date:23-10-2020 
 */
class CarOwnerInfo{
	private String name;
	private String regNo;
	public CarOwnerInfo(String name,String regNo)
	{
		this.name=name;
		this.regNo=regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
}
public class CarParking
{
	public static void main(String[] args) {
	Scanner sb=new Scanner(System.in);
	System.out.println("1.Car Parking\n2.Car Get\n3.Space Available");
	System.out.println("Enter your option");
	int option=sb.nextInt();
	String arr[][]=new String[5][];
	arr[0]=new String[100];
	arr[1]=new String[70];
	arr[2]=new String[50];
	arr[3]=new String[20];
	arr[4]=new String[10];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			arr[i][j]="null";
		}
	}
	switch(option)
	{
	    case 1 :
	    	System.out.println("Enter the name and RegNo");
	    	Scanner sc=new Scanner(System.in);
	    	String name=sc.nextLine();
	    	String regNo=sc.nextLine();
	    	CarOwnerInfo c=new CarOwnerInfo(name,regNo);
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		for(int j=0;j<arr[i].length;j++)
	    		{
	    			if(arr[i][j].equals("null"))
	    			{
	    				c.setRegNo(regNo);
	    				arr[i][j]=c.getRegNo();
	    				break;
	    			}
	    		}
	    	}
	    	break;
	    case 2:
	    	System.out.println("Enter the name and RegNo");
	    	Scanner s=new Scanner(System.in);
	    	String Name=s.nextLine();
	    	String RegNo=s.nextLine();
	    	CarOwnerInfo car=new CarOwnerInfo(Name,RegNo);
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		for(int j=0;j<arr[i].length;j++)
	    		{
	    			if(arr[i][j].equals(RegNo))
	    			{
	    				arr[i][j]="null";
	    				break;
	    			}
	    		}
	    	}
	    	break;
	    case 3:
	    	int space=0;
	    	System.out.println("Available Space in Car is:");
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		for(int j=0;j<arr[i].length;j++)
	    		{
	    			if(arr[i][j].equals("null"))
	    			{
	    				space++;
	    			}
	    		}
	    		
	    	}
	    	System.out.println(space);
	    	break;
	    }
	}
}
