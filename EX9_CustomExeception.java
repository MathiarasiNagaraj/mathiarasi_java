package Exercise_4;
import java.io.*;
import java.util.Scanner;

abstract class NumberException extends Exception{
	
}
class OutOfRangeException extends NumberException{
	String message;
	public OutOfRangeException (String message)
	{
		this.message=message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
}
class NegativeNumberException extends NumberException{
	String message;
	public NegativeNumberException (String message)
	{
		this.message=message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
}
public class EX9_CustomExeception {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int marksArray[]=new int[10];
	int sum=0,count=0;
	System.out.println("Enter marks of 10 students :");
	while(count<10)
	{
	try {
boolean flag=	sc.hasNextInt();
if(flag)
{
	marksArray[count]=sc.nextInt();
	try {
	checkNumber(marksArray[count]);
	sum+=marksArray[count];
	count++;
	}
	catch(NumberException e)
	{
		System.out.println(e);
		continue;
	}
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
public static void checkNumber(int a) throws NumberException
{
	
		if(a<0)
			throw new NegativeNumberException ("Enter a non-negative number");
		else if(a>100)
			throw new OutOfRangeException("Enter a number within 100");
	
}
}
