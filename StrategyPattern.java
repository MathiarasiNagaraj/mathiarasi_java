package Pattern;
import java.lang.reflect.InvocationTargetException;
import java.util.*;


public class StrategyPattern {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
	String shape;
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Square\n2.Circle\n3.Rectangle\n4.Triangle");
	System.out.println("Enter Cake shape");
	shape=sc.nextLine();
	shape=shape.trim();
	shape="Pattern."+shape;
	Cake newcake=new Cake();
      newcake.shape=(Shape)Class.forName(shape).getConstructor().newInstance();
	newcake.doCake();
}
}
class Cake {
	Shape shape;
	void doCake() {
		shape.makeShape();
	}
	
}
abstract class Shape{
	public Shape()
	{
		
	}
	abstract void makeShape();
}
class Square extends Shape{
	public Square()
	{
		
	}
	void makeShape(){
		System.out.println("Square shape cake");
	}
}
class Circle extends Shape{
	public Circle()
	{
		
	}
	
	void makeShape(){
		System.out.println("Circle shape cake");
	}
}
class Rectangle extends Shape{
	public Rectangle()
	{
		
	}
	void makeShape(){
		System.out.println("Rectangle shape cake");
	}
}
class Triangle extends Shape{
	public Triangle()
	{
		
	}
	void makeShape(){
		System.out.println("Triangle shape cake");
	}
}