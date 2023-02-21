package Exercise_2;

public class EX11_Constructor2 {
public static void main(String[] args) {
	Cclass obj=new Cclass(5,6);
	System.out.println(obj.var);
	
}
}
class Aclass2{
	int var;
	Aclass2(int a)
	{
		var =a;
	}
}
class Bclass2{
	int varb;
	Bclass2(int b)
	{
		varb=b;
	}
	
}
class Cclass extends Aclass2{
	Cclass(int a,int b)
	{
		super(a);
		Bclass2 obj=new Bclass2(b);
	}
}