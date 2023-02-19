package Exercise;
import java.util.*;
public class DaysInMonth {
public static void main(String[] args) {
String month;
System.out.println("Enter Month name");
Scanner sc=new Scanner(System.in);
month=sc.nextLine();
month=month.toLowerCase();
findDays(month);

}
public static void findDays(String Month)
{
	switch(Month)
	{
	case "january":
		System.out.println("Total days in "+Month+" is 31");
		break;
	case "february":
		System.out.println("Total days in "+Month+" is 28");
		break;
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
		break;
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
}
