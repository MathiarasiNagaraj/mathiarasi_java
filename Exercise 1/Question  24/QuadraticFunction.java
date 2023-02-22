package Exercise;
import java.util.*;
public class QuadraticFunction {
	int a,b,c;
	QuadraticFunction()
	{
		a=1;
		b=1;
		c=1;
	}
	QuadraticFunction(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int get_A_Value()
	{
		return a;
	}
	public int get_B_Value()
	{
		return b;
	}
	public int get_C_Value()
	{
		return c;
	}
	public void modifier(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int calculate(int x)
	{
		int f=this.a*(int)(Math.pow(x, 2))+this.b*(x)+this.c;
				return f;
	}
public static void main(String[] args) {
	
	QuadraticFunction obj=new QuadraticFunction();
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	System.out.println("Result using default constructor :"+obj.calculate(x));
	obj.modifier(5, 6, 7);
	System.out.println("After modifing the values"+obj.get_A_Value()+obj.get_B_Value()+obj.get_C_Value());
	System.out.println("Result using modifier  :"+obj.calculate(x));
	QuadraticFunction obj2=new QuadraticFunction(9,8,5);
	System.out.println("Result using paramaterized constructor :"+obj2.calculate(x));
	
}
}
