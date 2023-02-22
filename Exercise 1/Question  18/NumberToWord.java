package Exercise;
import  java.util.*;
public class NumberToWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int number =sc.nextInt();
	number=reverse(number);
	
	String words[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	

    String word="";
	int num=0,rem=0,count=0,temp=number;
	while(number>0)
	{
		 rem=number%10;
		 word+=words[rem]+" ";
		 number=number/10;
	}
    
	System.out.println(word);
}
public static int reverse(int n)
{
	
	int num=0,rem=0,temp=n;
	while(n>0)
	{
		 rem=n%10;
		 num =num*10+rem;
		 n=n/10;
		
	}
	
	return num;
}
}
