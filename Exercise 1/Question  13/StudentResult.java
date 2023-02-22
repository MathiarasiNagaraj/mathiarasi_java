package Exercise;
import java.util.*;
public class StudentResult {
public static void main(String[] args) {
	int student,sub;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of students :");
	student=sc.nextInt();
	System.out.println("Enter number of subjects :");
	sub=sc.nextInt();
	int arr[][]=new int [student][sub];
	int res[]=new int [sub];
	for(int i=0,k=0;i<student;i++)
	{
		System.out.println("Enter "+(i+1)+" th student marks");
		int sum=0;
		for(int j=0;j<sub;j++)
		{
			arr[i][j]=sc.nextInt();
			sum+=arr[i][j];
		}
		res[k++]=sum;
	}
	for(int i=0;i<res.length;i++)
	{
		System.out.println(" Result of "+(i+1)+" th student is "+res[i]);
	}
}
}
