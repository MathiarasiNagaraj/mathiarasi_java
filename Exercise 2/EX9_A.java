package Exercise_2;

public class EX9_A {
	public int var1=10;
	private int var2=190;
	protected int var3=989;
	public static void publicMethod()
	{
		System.out.println("Calling from public method  of base class");
		
	}
	private  int privateMethod()
	{
		System.out.println("Calling from private Method of base class");
		return 0;
	}
	protected  int protectedMethod()
	{
		System.out.println("Calling from Protected method of base class");
		return 0;
	}
	int defaultMethod() {
		System.out.println("Calling from defalt methods of base class");
		return 0;
}
	public static void main(String[] args) {
		publicMethod();
		B obj=new B();
		obj.changes();
		obj.protectedMethod();
		obj.Methodsub();
		//obj.privateMethod();
		System.out.println("Sub class Method :"+obj.add());
	}
}
class B extends EX9_A{
	void Methodsub()
	{
		System.out.println("Calling from sub class");
	}
	int add()
	{
		return var1+var3;
	}
    void changes()
    {
    	var1=23;
    	publicMethod();
    	//var2=390;
    	
//    privateMethod();
//    }
//    
    }
}