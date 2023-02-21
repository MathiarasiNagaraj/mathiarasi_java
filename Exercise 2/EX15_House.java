package Exercise_2;
import java.util.*;
class Door{
	int one_door=5000;
	int calculateCost(int n)
	{
		return n*one_door;
	}
}
class Window{
	int one_window=3000;
	int calculateCost(int n)
	{
		return n*one_window;
	}
}
public class EX15_House {
	public static void main(String[] args) {
		
	
Window w=new Window();
Door d=new Door();
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice :");
int choice=sc.nextInt();
	
	 if(choice ==2)
	 {
		 
	 
		int dr=d.calculateCost(3);
		int win=w.calculateCost(10);
		int total=totalCost(dr,win);
		System.out.println("Constructing two bhk with "+dr+" doors and "+win+" windows cost :"+total);
	}
	 else
	{
		int dr=d.calculateCost(9);
		int win=w.calculateCost(14);
		int total=totalCost(dr,win);
		System.out.println("Constructing two bhk with "+dr+" doors and "+win+" windows cost :"+total);
	}
	}
	static int totalCost(int d,int w)
	{
		int building_cost=10000;
		int transport_cost=5000;
		return building_cost+transport_cost+d+w;
		
	}
}
