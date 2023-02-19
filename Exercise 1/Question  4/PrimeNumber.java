package Exercise;
import java.util.*;
public class PrimeNumber {
public static void main(String[] args) {
	int number;
	Scanner sc=new Scanner(System.in);
	String flag;
	while(true)
	{
	System.out.println("Enter a number :");
	//System.out.println("Type STOP to stop the program");
	number =sc.nextInt();
	checkPrime(number);
    
	flag=sc.nextLine();
	}
}
public static void checkPrime(int n)
{
	int flag=0;
	for(int i=2;i<=Math.sqrt(n);i++)
	{
		if(n%i==0)
		{
			flag=1;
			System.out.println(n+" is divisible by "+i+" not a prime number ");
			break;
		}
	}
	if(flag==0)
	System.out.println(n+" is a prime number");
}
}
