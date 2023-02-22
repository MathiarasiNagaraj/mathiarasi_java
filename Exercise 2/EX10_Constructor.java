package Exercise_2;

public class EX10_Constructor {
	public static void main(String[] args) {
		C obj=new C();
	}

}
class Aclass{
	Aclass()
	{
	System.out.println("constructor of A class ");	
	}
}
class Bclass{
	Bclass()
	{
		System.out.println("constructor of B class ");	
	}
	
}
class C extends Aclass{
	Bclass o=new Bclass();
	void Method_B()
	{
		
	}
}
//super class constructor implicitly get called