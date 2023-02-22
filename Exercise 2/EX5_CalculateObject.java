package Exercise_2;

public class EX5_CalculateObject {
	static int  count=0;
	EX5_CalculateObject()
	{
		count++;
	}
public static void main(String[] args) {
	
	EX5_CalculateObject obj=new EX5_CalculateObject();
	EX5_CalculateObject obj1=new EX5_CalculateObject();
	System.out.println("Number of objects created :"+count);
	EX5_CalculateObject obj2=new EX5_CalculateObject();
	EX5_CalculateObject obj3=new EX5_CalculateObject();
	System.out.println("Number of objects created :"+count);
	EX5_CalculateObject obj4;
	System.out.println("Number of objects created :"+count);
	
}
}
