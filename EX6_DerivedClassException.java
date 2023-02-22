package Exercise_4;

import java.util.Scanner;

class NameException extends Exception{
	String message;
	public NameException() throws  NameException{
		throw new NameException();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Calling from base class";
	}
}
class ChildNameException extends NameException{
	public ChildNameException() throws Exception{
		try {
			throw new NameException();
		}catch(NameException e)
		{
			System.out.println(e);
		}
	}
}
public class EX6_DerivedClassException {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your name");
		try {
			
			String name=sc.nextLine();
			checkName(name);
		}
		finally
		{
			System.out.println("exception is not catched");
		}
	}
	public static void checkName(String Name) throws Exception
	{
		if(Name.contains("$")||Name.contains("*")||Name.contains("*"))
		{
			throw new ChildNameException();
		}
	}
}
