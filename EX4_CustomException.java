package Exercise_4;

import java.util.Scanner;

class InvalidNumberException extends Exception
{
	String messsage;
	public InvalidNumberException(String message)
	{
		this.messsage=message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return messsage;
	}
}
public class EX4_CustomException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int number;
	try {
		
		System.out.println("Enter your Age : ");
		number=sc.nextInt();
		checkValiditiy(number);
		System.out.println("Your age is :"+number);
		}
	catch(InvalidNumberException ie)
	{
		System.out.println(ie);
	}
	
}
public static void checkValiditiy(int number) throws InvalidNumberException
{
	if(number<0)
		throw new InvalidNumberException("Enter positive number");
	if(number >120)
		throw new InvalidNumberException("Enter the number with in 120");
}
}
