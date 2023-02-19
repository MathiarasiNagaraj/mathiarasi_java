package Exercise;
import java.util.*;
public class DisplayArray {
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
	System.out.println("Displaying array elements :");
	displayMatrix(arr);
	
}
public static void displayMatrix(int arr[][])
{
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
}
