package Exercise_2;

public class EX7_StateOfObject {
int var1=10;

public static void main(String[] args) {
	EX7_StateOfObject obj=new EX7_StateOfObject();
	obj.var1=20;
	final EX7_StateOfObject obj2 = new EX7_StateOfObject();
	obj2.var1=30;
	System.out.println(obj2.var1);
	obj2.var1=203;
	
}
}
