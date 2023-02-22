package Exercise;
import java.util.*;
public class DaysInMonth {
public static void main(String[] args) {
String month;
int year;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Month name :");
month=sc.nextLine();

System.out.println("Enter year :");
year=sc.nextInt();

month=month.toLowerCase();
findDays(month,year);

}
public static void findDays(String Month,int year)
{
	switch(Month)
	{
	case "january":
		System.out.println("Total days in "+Month+" is 31");
		break;
	case "february":
	{
		if(isLeapYear(year))
		System.out.println("Total days in "+Month+" is 29");
		else
			System.out.println("Total days in "+Month+" is 28");
		
		break;
	}
	case "march":
		System.out.println("Total days in "+Month+" is 31");
		break;
	case "april":
		System.out.println("Total days in "+Month+" is 30");
		break;
	case "may":
		System.out.println("Total days in "+Month+" is 31");
		break;
	case "june":
		System.out.println("Total days in "+Month+" is 30");
		break;
	case "july":
		System.out.println("Total days in "+Month+" is 31");
		break;
	case "august":
		System.out.println("Total days in "+Month+" is 31");
		break;
	case "september":
		System.out.println("Total days in "+Month+" is 30");
		break;a
	case "october":
		System.out.println("Total days in "+Month+" is 31");
		break;
	case "november":
		System.out.println("Total days in "+Month+" is 30");
		break;
	case "december":
		System.out.println("Total days in "+Month+" is 31");
		break;
	}	
}
public  static boolean isLeapYear(int year)
{
	if(year%4==0)
	{
		if(year%100==0)
		{
			if(year%400==0)
				return true;
			else 
				return false;
		}
		else
			return true;
	}
	else
		return false;
		
		
}
}
