package Exercise;
import java.util.*;
public class AverageOfNumber {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter total number of items :");
	n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the values ...");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();	
		}
	findAverage(arr);
	
}
public static void findAverage(int arr[])
{
	float avg=0;
	for(int i=0;i<arr.length;i++)
	{
		avg+=arr[i];
	}
	System.out.println("The average  is "+avg/(float)arr.length);
}
}
