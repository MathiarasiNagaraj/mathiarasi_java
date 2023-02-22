package Exercise;

public class ProtectedCheck {
	protected static int var1=123;
public static void main(String[] args) {
	ProtectedCheck obj=new ProtectedCheck();
	System.out.println("Displaying it from own class :"+var1);
	var1=2;
	SecondClass obj2=new SecondClass();
	obj2.callMe();
}
}
class SecondClass
{
	void callMe()
	{
	ProtectedCheck obj=new ProtectedCheck();
	System.out.println(obj.var1);
	obj.var1=2;
	System.out.println("Displaying it from own class :"+obj.var1);
	}
}

