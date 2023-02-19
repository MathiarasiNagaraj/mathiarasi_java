package Exercise;

import java.util.Scanner;

public class prime1To100 {
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		String flag;
		for(number =1;number<=100;number++)
		checkPrime(number);
	   
	}
	public static void checkPrime(int n)
	{
		int flag=0;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				flag=1;
				
				break;
			}
		}
		if(flag==0)
		System.out.println(n+" is a prime number");
	}
}
