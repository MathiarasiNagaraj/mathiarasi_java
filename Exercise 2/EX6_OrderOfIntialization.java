package Exercise_2;

public class EX6_OrderOfIntialization {
	static {
		System.out.println("This is Static Block ");
		
	}
	
	EX6_OrderOfIntialization()
	{
		System.out.println("This is Constructor ");
	}
	{
		System.out.println("This is initialization block");
	}
	public static void main(String[] args) {
		EX6_OrderOfIntialization obj=new EX6_OrderOfIntialization();
		
	}
}
