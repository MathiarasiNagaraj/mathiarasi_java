package Exercise_4;
import java.util.*;
class NameException extends Exception{
	String message;
	public NameException(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
}
public class EX5_CustomExceptionWITHMethods {
public static void main(String[] args) throws NameException {
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
public static void checkName(String Name) throws NameException
{
	if(Name.contains("$")||Name.contains("*")||Name.contains("*"))
	{
		throw new NameException("Name cannot contain special character");
	}
}
}
