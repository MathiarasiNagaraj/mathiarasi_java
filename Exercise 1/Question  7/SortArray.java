package Exercise;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of items :");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the values ...");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	}
		System.out.println("Printing array before sorting");
		printArray(arr);
		System.out.println("Printing array in Ascending order");
		ascendingArray(arr);
		printArray(arr);
		System.out.println("Printing array in Descending order");
		descendingArray(arr);
		
		printArray(arr);
		
	}
	public static void printArray(int arr[])
	{
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
	}
	public static void ascendingArray(int arr[])
	{
		//0 1,2,3,
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
				}
			}
			
		}
		
	}
	public static void descendingArray(int arr[])
	{
		//3,2,1,0
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
				}
			}
			
		}
		
	}
}
