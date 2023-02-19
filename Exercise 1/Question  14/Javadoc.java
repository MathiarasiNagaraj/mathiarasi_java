package Exercise;
import java.util.*;
public class Javadoc {
public static void main(String[] args) {
	//Scanner is class used to scan inputs from user
    Scanner sc=new Scanner(System.in);
    //nextInt() method is used to get integer inputs
    int num=sc.nextInt();
    //digit count method
    /***
     * using mod operator to get the last digit
     * then dividing the number by 10
     * we can get the count of the digit using a loop
     * **
     */
    //println() is the method to print the message to the console
    System.out.println("Total digits of the number is :"+digitCount(num));
}
//method signature
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
