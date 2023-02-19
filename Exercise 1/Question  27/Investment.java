package Exercise;

public class Investment {
public static void main(String[] args) {
	int investment=14_000;
	//increased during first year by 40%
	int firstYear=14_000+(int)(0.4*14_000);
	int secondYear=firstYear-1500;
	int thirdYear=secondYear+(int)(1.2*secondYear);
	System.out.println(investment);
}
}
