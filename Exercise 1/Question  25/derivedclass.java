package Exercise;

protected class Base {
String Method()
{
	return "wow";
}

}
public class derivedclass{
	public static void main(String[] args) {
		
	}
	public void useD(){
		Base z=new Base();
		System.out.println("base says, "+z.Method());
	}
}
