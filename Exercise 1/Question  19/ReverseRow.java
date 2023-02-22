package Exercise;

import java.util.Scanner;

public class ReverseRow {
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
	System.out.println("Displaying array elements before reversing:");
	displayarray(arr);
	reverseRow(arr);
	System.out.println("Displaying array elements after reversing:");
	displayarray(arr);
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
public static void reverseRow(int arr[][]) {
	for(int i=0;i<4;i++)
	{
		for(int j=0,k=arr[i].length-1;j<k;j++,k--)
		{
			int temp=arr[i][j];
			arr[i][j]=arr[i][k];
			arr[i][k]=temp;
		}
		
	}
}
}
