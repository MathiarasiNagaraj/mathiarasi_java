package Exercise_3;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
abstract class Shapes{
	
}
interface CalcArea
{
	final double PI=Math.PI;
	void calcArea();	
}
interface CalcVolume
{
	void calcVolume();
}
interface CalSurfaceArea{
	void calcSurfaceArea();
}
interface CalcPeri{
	void calcPerimeter();
}
class Circle extends Shapes implements CalcArea,CalcPeri
{
	public static float r;
	Scanner sc=new Scanner(System.in);

	public void calcArea()
	{
		r=sc.nextFloat();
		System.out.println("Area of the circle is :"+PI*r*r);
		//return PI*r*r;
		
	}
	public void calcPerimeter()
	{
		System.out.println("Area of the circle is :"+PI*r*2);
	}
	
}
class Square  extends Shapes implements CalcArea,CalcPeri
{
	public static float side;
	public void calcArea()
	{
		Scanner sc=new Scanner(System.in);
		side=sc.nextFloat();
		System.out.println("Area of the square is :"+Math.pow(side, side));
		//return PI*r*r;
		
	}
	public void calcPerimeter()
	{
		System.out.println("Area of the square is :"+4*side);
	}
}
class Triangle  extends Shapes implements CalcArea,CalcPeri
{
	Triangle()
	{
		System.out.println("Triangle methods :");
		calcArea();
		calcPerimeter();
	}
	static float base,height,side1,side2,side3;
	public void calcArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base : ");
		base=sc.nextFloat();
		System.out.println("Enter height : ");
		height=sc.nextFloat();
		System.out.println("Area of the square is :"+0.5*base*height);
		//return PI*r*r;
		
	}
	public void calcPerimeter()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side 1 : ");
		side1=sc.nextFloat();
		System.out.println("Enter side 2 : ");
		side2=sc.nextFloat();
		System.out.println("Enter side 3 : ");
		side3=sc.nextFloat();
		System.out.println("Area of the square is :"+(side1+side2+side3));
	}
}
class Sphere  extends Shapes implements CalcArea,CalcPeri,CalSurfaceArea,CalcVolume{
	public static float r;
	Scanner sc=new Scanner(System.in);
    Sphere()
    {
    	System.out.println("Sphere methods :");
    	calcArea();
    	calcPerimeter();
    	calcSurfaceArea();
    	calcVolume();
    }
	public void calcArea()
	{
		System.out.println("Enter radius : ");
		r=sc.nextFloat();
		System.out.println("Area of the circle is :"+PI*r*r);
		//return PI*r*r;
		
	}
	public void calcPerimeter()
	{
		System.out.println("Area of the circle is :"+PI*r*2);
	}
	public void calcSurfaceArea()
	{
		System.out.println("Area of the circle is :"+4*PI*r*r);
	}
	public void calcVolume()
	{
		System.out.println("Area of the circle is :"+4/3*PI*r*r*r);
	}
}
public class Shape {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
	System.out.println("Circle \n Square \n Triangle \n Sphere");
	System.out.println("Enter what shape you want :");
	Scanner sc=new Scanner(System.in);
	String c=sc.nextLine();
	c=c.trim();
	c="Exercise_3."+c;
	Shapes s=(Shapes)Class.forName(c).newInstance();
	

}
}
