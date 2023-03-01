package Pattern;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
abstract class Cadbury{
	
}
class CadburyFactory{
	public static Cadbury chocolate;
	public static Cadbury makeChocholate(String type) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException
	{
		type="Pattern."+type;
		chocolate=(Cadbury)Class.forName(type).getConstructor().newInstance();
		return chocolate;
		
	}
	
}
class DiaryMilk extends Cadbury{
	public DiaryMilk()
	{
		System.out.println("Diary milk");
	}
	
}
class DiaryMilkSilk extends DiaryMilk{
	public DiaryMilkSilk()
	{
		System.out.println("Diarymilk silk");
	}
}
class Gems extends Cadbury{
	public Gems()
	{
	System.out.println("Gems");	
	}
}
class Perk extends Cadbury{
	public Perk()
	{
		System.out.println("perks");	

	}
}
class Oreo extends Cadbury{
	public Oreo()
	{
		System.out.println("oreo");	

	}
}
class CadburyShop 
{
	static Cadbury chocolate;
public static Cadbury getChocolate(String type) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException
{

   chocolate=CadburyFactory.makeChocholate(type);
   return chocolate;
}

}
public class FactoryMethodPattern{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
	System.out.println("Enter the chocolate");
	Scanner scanner= new Scanner(System.in);
	String type=scanner.nextLine();
		Cadbury chocolate=CadburyShop.getChocolate(type);
	}
}