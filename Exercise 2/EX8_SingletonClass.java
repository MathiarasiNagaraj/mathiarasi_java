package Exercise_2;

class Singleton{
	int var=10;
	private Singleton()
	{
		System.out.println("Calling from singleton private constructor");
	}
	private static Singleton obj=null;
	public static Singleton getObject()
	{
		return obj==null?new Singleton():obj;
	}
	
}
public class EX8_SingletonClass {
	
	
public static void main(String[] args) {
//	Singleton s=new Singleton();
	//constructor is not visible
	Singleton s=Singleton.getObject();
	s.var=23;
	System.out.println(s.var);
	Singleton s2=Singleton.getObject();
	System.out.println(s.var);
	//changing through one object will reflect in all the objects
}
}