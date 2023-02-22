package Exercise;

import java.util.Scanner;

public class FindLocation {

	public static void main(String[] args) {
		int n=0,num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of items :");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the values ...");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();	
			
		
		
		System.out.println("Enter number whose location to be found :");
		num=sc.nextInt();
		if(findElement(arr,num)>0)
			System.out.println("element found "+findElement(arr,num)+" times");
		else
		System.out.println("element not found");
	}
	

public static void printArray(int arr[])
{
	
	for(int j=0;j<arr.length;j++)
	{
		System.out.println(arr[j]);
	}
}
public static int findElement(int arr[],int ele)
{
	int count=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]==ele)
		{
			System.out.println(ele +"found in "+i);
			count++;
		}
	}
	return count;
	
}
}
