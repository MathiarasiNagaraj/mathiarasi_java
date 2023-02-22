package Exercise;

import java.util.Scanner;

public class LargestRowElement {
public static void main(String[] args) {
	int arr[][]=new int[4][4];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array elements :");
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	displayarray(arr);
	findLargeEle(arr);
	
}
public static void displayarray(int arr[][]) {
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			System.out.print(arr[i][j]);
			System.out.print('\t');
		}
		System.out.println();
	}
}
public static void findLargeEle(int arr[][])
{
	for(int i=0;i<4;i++)
	{
		int max=arr[i][0];
		
		for(int j=0;j<4;j++)
		{
			
			if(max<arr[i][j])
				max=arr[i][j];
		}
		
		System.out.println("Maximum of "+i+" th row is : "+max);
	}
}
}
