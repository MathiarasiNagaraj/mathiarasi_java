package Exercise;
import java.util.*;
public class Number {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check :");
	int num=sc.nextInt();
	boolean x=isPerfectNumber(num);
	if(x)
	System.out.println(num+" is a perfect number");
	boolean y=isArmstrongNumber(num);
	if(y)
	System.out.println(num+" is a armstrong number");
	boolean z=isPalindromeNumber(num);
	if(z)
	System.out.println(num+" is a palindrome number");
	if((x==false&&y==false)&&(z==false&&y==false)&&(z==false&&x==false))
		System.out.println("The number is none of the above");
}
public static boolean  isPerfectNumber(int n)
{int num=0,sum=0,temp=n;
int count= digitCount(n);
for(int i=1;i<n;i++)
{
	if(n%i==0)
		sum+=i;
}
//System.out.println(sum);
	return temp==sum;
}
public static boolean  isArmstrongNumber(int n)
{
	int num=0,rem=0,temp=n;
	int count= digitCount(n);
	while(n>0)
	{
		 rem=n%10;
		 num+=Math.pow(rem, count);
		 n=n/10;
		
	}
	return num==temp;
}

public static boolean  isPalindromeNumber(int n)
{int num=0,rem=0,temp=n;
	while(n>0)
	{
		 rem=n%10;
		 num =num*10+rem;
		 n=n/10;
		
	}
	//System.out.println(temp+" "+num);
	return temp==num;
}


public static int digitCount(int n)
{
	int num=0,rem=0,count=0;
	while(n>0)
	{
		 rem=n%10;
		 
		 n=n/10;
		 count++;
		
	}
	//System.out.println(temp+" "+num);
	return count;
}
}