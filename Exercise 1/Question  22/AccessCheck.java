package Exercise;

public class AccessCheck {
	public int var1=10;
	private int var2=190;
	protected int var3=989;
	int var4=56;
public static void main(String[] args) {
	AccessCheck obj=new AccessCheck();
	System.out.println("Members");
	System.out.println(obj.var1);
	System.out.println(obj.var2);
	System.out.println(obj.var3);
	System.out.println(obj.var4);
	System.out.println("Methods");
	System.out.println(obj.publicMethod());
	System.out.println(obj.privateMethod());
	System.out.println(obj.protectedMethod());
	System.out.println(obj.defaultMethod());
		
}
public  int publicMethod()
{
	System.out.println("Calling from public method ");
	return 0;
}
private  int privateMethod()
{
	System.out.println("Calling from private Method");
	return 0;
}
protected  int protectedMethod()
{
	System.out.println("Calling from Protected method");
	return 0;
}
int defaultMethod() {
	System.out.println("Calling from defalt methods");
	return 0;
}

}
