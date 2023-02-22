package Exercise_2;
class X
{
	void do1(){
		System.out.println("Calling do1 from "+this.getClass()+" object");
	}
}
class Y extends X
{
	void do2()
	{
		System.out.println("Calling do2 from "+this.getClass()+" object");
	}
}
public class EX16_Chrome {
public static void main(String[] args) {
	X x1=new X();
	X x2=new Y();
	Y y1=new Y();
	//downcasting
	//(Y)x2.do2();
	((Y)x2).do2();
}
}
