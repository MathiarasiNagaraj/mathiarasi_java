
package Pattern;
import java.util.*;


public class CommandPattern {
	public static void main(String[] args) {
		ControlScreen screen=new ControlScreen();

		Apple  apple = new Apple();
		Sugar sugar=new Sugar();
		Milk milk=new Milk();
		Orange orange = new Orange();
		Grapes grape = new Grapes();
		Lemon lemon = new Lemon();
		RoseEssence rose=new RoseEssence();
		Chocolate chocolate=new Chocolate();
        Scanner scan=new Scanner(System.in);
		
        AppleJuice Applejuice=new AppleJuice(apple,milk,sugar);
        OrangeJuice Orangejuice=new OrangeJuice(orange,sugar);
        GrapeJuice Grapejuice=new GrapeJuice(grape,milk,sugar);
        LemonJuice lemonjuice=new LemonJuice(lemon,sugar);
        RoseMilk    Rosemilk=new RoseMilk(rose,milk,sugar);
        ChocolateMilk Chocolatemilk=new ChocolateMilk(chocolate,milk,sugar);
        
        screen.assignCommand(1, Applejuice);
        screen.assignCommand(2, Orangejuice);
        screen.assignCommand(3, Grapejuice);
        screen.assignCommand(4, lemonjuice);
        screen.assignCommand(5, Rosemilk);
        screen.assignCommand(6, Chocolatemilk);
     
		System.out.println("1.Apple juice\n2.Orange juice\n3.Grapes juice\n4.lemon juice\n5.RoseMilk\n6.Chocolate Milk");
		System.out.println("Enter your choice :");
		int choice = scan.nextInt();
		screen.executeCommand(choice);
		scan.close();
	}
}

class ControlScreen {
	private static final Map<Integer, Command> commands = new HashMap<>();

	

	public void executeCommand(int slot) {
		commands.get(slot).execute();
	}

	public void assignCommand(int slot, Command command) {
		commands.put(slot, command);
	}
}

abstract class Command {


	public Command() {
		
	}

	
	public abstract void execute();
}



class AppleJuice extends Command {
	Apple apple;Milk milk;Sugar sugar;
	public AppleJuice(Apple apple,Milk milk,Sugar sugar) {
	  this.apple=apple;
	  this.milk=milk;
	  this.sugar=sugar;
	}

	@Override
	public void execute() {
		
		apple.addApple();
		milk.addOneCupMilk();
		sugar.addSugar(4);
		System.out.println("Enjoy your apple juice");
		
	}
}

class OrangeJuice extends Command {
	Orange orange;Sugar sugar;
	public OrangeJuice(Orange orange,Sugar sugar) {
		this.orange=orange;
		this.sugar=sugar;
	}

	@Override
	public void execute() {
		orange.addOrange();
		sugar.addSugar(4);
		System.out.println("Enjoy your orange juice");
	}
}

class GrapeJuice extends Command {
	Grapes grape;Milk milk;Sugar sugar;
	public GrapeJuice(Grapes grape,Milk milk,Sugar sugar) {
		this.grape=grape;
		this.milk=milk;
		this.sugar=sugar;
	}

	@Override
	public void execute() {
		grape.addGrapes();
		milk.addHalfCupMilk();
		sugar.addSugar(2);
		System.out.println("Enjoy your grapes juice");
	
	}
}
class LemonJuice extends Command {
	Lemon lemon;Sugar sugar;
	public LemonJuice(Lemon lemon,Sugar sugar) {
		this.lemon=lemon;
		this.sugar=sugar;
		
	}

	@Override
	public void execute() {
		lemon.addlemon();
		sugar.addSugar(5);
		System.out.println("Enjoy your lemon juice");
	
	}
}
class RoseMilk extends Command {
	RoseEssence rose;Milk milk;Sugar sugar;
	public RoseMilk(RoseEssence rose,Milk milk,Sugar sugar) {
		this.rose=rose;
		this.milk=milk;
		this.sugar=sugar;
		
	}

	@Override
	public void execute() {
	rose.addRoseEssence();
	milk.addOneCupMilk();
	sugar.addSugar(3);
	System.out.println("Enjoy your RoseMilk");
	}
}
class ChocolateMilk extends Command {
	Chocolate chocolate;Milk milk;Sugar sugar;
	public ChocolateMilk(Chocolate chocolate,Milk milk,Sugar sugar) {
		this.chocolate=chocolate;
		this.milk=milk;
		this.sugar=sugar;
	}

	@Override
	public void execute() {
		chocolate.addChocolate();
		milk.addOneCupMilk();
		sugar.addSugar(4);
		System.out.println("Enjoy your chocolate milk");
	
	}
}
class Apple{
	
	void addApple()
	{
		System.out.println("Added 2 Apple");
	}
	
}
class Orange{
	void addOrange()
	{
		System.out.println("Added 2 Orange ");
	}
	
}
class Grapes{
	void addGrapes()
	{
		System.out.println("Added 150 grams of grapes");
	}
	
}
class Lemon{
	void addlemon()
	{
		System.out.println("squeezed 1/2 lemon");
	}
	
}
class RoseEssence{
	void addRoseEssence()
	{
		System.out.println("Added 5 drops of rose essence");
	}
	
}
class Chocolate{
	void addChocolate()
	{
		System.out.println("Added 10 chocolate");
	}
	
}
class Milk{
	void addHalfCupMilk()
	{
		System.out.println("Added Half cup of milk");
	}
	void addOneCupMilk()
	{
		System.out.println("Added 1 cup of Milk");
	}
	
}
class Sugar{
	void addSugar(int n)
	{
		System.out.println("Added "+n+" spoon of sugar");
	}
}
