package Exercise_4;
import java.util.*;

public class EX8_NumberException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int marksArray[]=new int[10];
	int sum=0;
	System.out.println("Enter marks of 10 students :");
	for(int i=0;i<marksArray.length;i++)
	{
	try {
boolean flag=	sc.hasNextInt();
if(flag)
{
	marksArray[i]=sc.nextInt();
	sum+=marksArray[i];
}
else
	throw new NumberFormatException("enter a valid number");
	}
			
		
	catch(NumberFormatException ne) {
		System.out.println(ne);
		sc.next();
		continue;

		
	}
	
}
	System.out.println("Average of 10 student marks is :"+sum/10);
}
}