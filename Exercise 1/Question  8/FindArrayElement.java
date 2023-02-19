package Exercise;

import java.util.Scanner;
import java.lang.System;
public class FindArrayElement {
	
	public static void main(String[] args) {
		int n=0,num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of items :");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the values ...");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();	
			
		
		printArray(arr);
		System.out.println("Enter number whose location to be found :");
		num=sc.nextInt();
        
	}
	

public static void printArray(int arr[])
{
	
	for(int j=0;j<arr.length;j++)
	{
		System.out.println(arr[j]);
	}
}
public static void findElement(int arr[],int ele)
{
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]==ele)
		{
			System.out.println(ele+" found in array in "+i+" th index");
			System.exit(0);
		}
	}
	
	
}
}