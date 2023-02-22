package Exercise_4;
import java.util.*;
class NumberdivisionException extends Exception
{

}
class DivisionByZeroException extends NumberdivisionException{
	String message;
	public DivisionByZeroException(String message)
	{
		this.message=message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
}
class PoorInputException extends NumberdivisionException{
	String message;
	public PoorInputException(String message)
	{
		this.message=message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
}

public class EX7_NumberException {
public static void main(String[] args) throws DivisionByZeroException, PoorInputException {
	Scanner sc=new Scanner(System.in);
	float divisor=0f,numerator=0f;
 while(true)
	{
		
	
		System.out.println("Enter numerator :");
		try 
		{
		boolean flag=sc.hasNextFloat();
		if(flag)
		numerator=sc.nextFloat();
		else
		{
			String value=sc.next();
			value=value.toLowerCase();
			if(value.equals("q"))
			{
				System.out.println("Program completed");
				System.exit(0);
			}
			else
				throw new PoorInputException("enter valid number");
		}
		if(numerator==0)
		{
			throw new DivisionByZeroException("INVALID DIVISOR");
		}
		}
		catch(Exception ie)
		{
			System.out.println(ie);
			continue;
			//return;
		}
		
		System.out.println("Enter divisor :");
		try {
		boolean flag=sc.hasNextFloat();
		if(flag)
	     divisor=sc.nextFloat();
		else
		{
			
				throw new PoorInputException("enter valid number");
		}
		if(divisor==0)
		{
			throw new DivisionByZeroException("INVALID DIVISOR");
		}
		}catch(Exception ie)
		{
			System.out.println(ie);
			continue;
		}
		
		System.out.println("Result :"+(numerator/divisor));
	}
}

}
