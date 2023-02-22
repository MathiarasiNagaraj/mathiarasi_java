package Exercise;

public class TestAccess {
public static void main(String[] args) {
	 final float  pi=3.14f;
	
//	 pi=2;
//	 System.out.println(pi);
//	 //changing final will rise error
//	 static char c='a';
//	 callMe(c);
	 //cannot make a static reference to non static method
	 OneArg ag=new OneArg();
	 //OneArg()(non parameterized )constructor is not defined
}
public void callMe(char c)
{
	System.out.println(c);
}
}
class OneArg
{
	OneArg(int a)
	{
		a=10;
	}
}