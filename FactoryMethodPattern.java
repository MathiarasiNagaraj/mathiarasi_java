package Pattern;

import java.lang.Exception;
import java.util.*;

abstract class Cadbury {
	void prepareCocoa() {
		System.out.println("High class cocoa is mixed with milk");
	}

	abstract void addSweetness();

	abstract void makeShape();

	abstract void pack();
}

class CadburyFactory {
	public static Cadbury chocolate;

	public static Cadbury makeChocholate(String type) throws Exception {
		type = "Pattern." + type;
		chocolate = (Cadbury) Class.forName(type).getConstructor().newInstance();
		return chocolate;

	}

}

class DiaryMilk extends Cadbury {

	public DiaryMilk() {
		prepareCocoa();
		addSweetness();
		makeShape();
		pack();
	}

	@Override
	void prepareCocoa() {
		System.out.println("Make cocoa very thick");
	}

	void addSweetness() {
		System.out.println("Adding extra sweet in diarymilk");
	}

	void makeShape() {
		System.out.println("Make diarymilk as square");
	}

	void pack() {
		System.out.println("Pack 6 piece in one chocolate");
	}

}

class DiaryMilkSilk extends DiaryMilk {

	public DiaryMilkSilk() {
		prepareCocoa();
		addSweetness();
		makeShape();
		pack();
	}

	@Override
	void prepareCocoa() {
		System.out.println("Make cocoa very creamy");
	}

	void addSweetness() {
		System.out.println("Adding extra sweet and chocolate bitter in diarymilk");
	}

	void makeShape() {
		System.out.println("Make diarymilk as square");
	}

	void pack() {
		System.out.println("Pack 8 piece in one chocolate");
	}
}

class Perk extends Cadbury {

	public Perk() {
		prepareCocoa();
		addSweetness();
		makeShape();
		makeWaffer();
		pack();

	}

	void addSweetness() {
		System.out.println("Adding sweetness");
	}

	void makeShape() {
		System.out.println("Make perk choco liquid");
	}

	void makeWaffer() {
		System.out.println("make waffer and dip in chocolate cocoa");
	}

	void pack() {
		System.out.println("pack 15cm waffer in one piece");
	}
}

class Oreo extends Cadbury {

	public Oreo() {
		prepareCocoa();
		addSweetness();
		makeShape();
		makeBiscuit();
		pack();

	}

	@Override
	void prepareCocoa() {
		System.out.println("Make cocoa very creamy and bitterly");
	}

	void addSweetness() {
		System.out.println("Adding extra sweet and chocolate bitter in oreo");
	}

	void makeShape() {
		System.out.println("Make oreo cream in round shape");
	}

	void makeBiscuit() {
		System.out.println("Make chocolate biscuit");
	}

	void pack() {
		System.out.println("Pack 8 piece in one chocolate biscuit");
	}
}

class CadburySeller {
	static Cadbury chocolate;

	public static Cadbury getChocolate(String type) throws Exception {

		chocolate = CadburyFactory.makeChocholate(type);

		return chocolate;
	}
}

class Shop {
	static Cadbury chocolate;

	static Cadbury getChocolate(String type) throws Exception {
		chocolate = CadburySeller.getChocolate(type);

		return chocolate;
	}

}

public class FactoryPattern {
	public static void main(String[] args) throws Exception {
		System.out.println("Cadbury Products:\nDiaryMilk\nDiaryMilkSilk\nPerk\nOreo");
		System.out.println("Enter the chocolate :");
		Scanner scanner = new Scanner(System.in);
		String type = scanner.nextLine();
		Cadbury chocolate = Shop.getChocolate(type);
		scanner.close();
		System.out.println("Enjoy cadbury!!!!");
	}
}
