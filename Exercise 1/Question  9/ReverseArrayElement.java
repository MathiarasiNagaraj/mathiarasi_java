package Exercise;

import java.util.Scanner;

public class ReverseArrayElement {
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
	System.out.println("Printing array before reversing...");
	printArray(arr);
	reverseArray(arr);
	System.out.println("Printing array after reversing...");
	printArray(arr);
	
}
public static void printArray(int arr[])
{
	
	for(int j=0;j<arr.length;j++)
	{
		System.out.println(arr[j]);
	}
}
public static void reverseArray(int arr[])
{
	for(int i=0,j=arr.length-1;i<j;i++,j--)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		//System.out.println(arr[i]+'\t'+arr[j]);
	}
	
}
}
