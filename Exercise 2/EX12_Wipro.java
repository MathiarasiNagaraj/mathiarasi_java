package Exercise_2;
abstract class Wipro
{
	abstract void provideService();
	abstract void doResearch();
	abstract void Consulting();
}
class WiproTechnology extends Wipro 
{
	@Override
	void provideService() {
		// TODO Auto-generated method stub
		System.out.println("Provide technical services across the world");
	}
	@Override
	void doResearch() {
		// TODO Auto-generated method stub
		System.out.println("Do research on technical and automation of the jobs");
		
	}
	@Override
	void Consulting() {
		// TODO Auto-generated method stub
		System.out.println("provide consulting for many technical projects");
		
	}
}
class WiproBPO extends Wipro
{
	@Override
	void provideService() {
		// TODO Auto-generated method stub
		System.out.println("Provide buisness services across the world");

	}
	@Override
	void doResearch() {
		// TODO Auto-generated method stub
		System.out.println("Do research on buisness cases and analytics");
	}
	@Override
	void Consulting() {
		// TODO Auto-generated method stub
		System.out.println("provide consulting forr many buisness cases");
		
	}
}
class WiproInfoTech extends Wipro
{
	@Override
	void provideService() {
		// TODO Auto-generated method stub
		System.out.println("Provide Info-technical services across the world");
	}
	@Override
	void doResearch() {
		// TODO Auto-generated method stub
		System.out.println("Do research on Info-technical and automation of the jobs");
	}
	@Override
	void Consulting() {
		// TODO Auto-generated method stub
		System.out.println("provide consulting for many Info-technical projects");
		
	}
}
public class EX12_Wipro {
public static void main(String[] args) {
	Wipro obj[]=new Wipro[3] ;
	obj[0]=new WiproTechnology();
	obj[1]=new WiproInfoTech();
	obj[2]=new WiproBPO();
	System.out.println("Wipro Technology");
	obj[0].Consulting();
	obj[0].doResearch();
	obj[0].provideService();
	System.out.println("Wipro BPO");
	obj[1].doResearch();
	obj[1].provideService();
	obj[1].Consulting();
System.out.println("Wipro Info Tech");
	obj[2].doResearch();
	obj[2].provideService();
	obj[2].Consulting();
	
}
}
