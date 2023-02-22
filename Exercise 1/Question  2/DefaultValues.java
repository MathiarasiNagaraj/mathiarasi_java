package Exercise;

public class DefaultValues {
	static byte byteDefaulteValue;
	static short shortDefaulteValue;
	static int intDefaulteValue;
	static long longDefaulteValue;
	static char characterDefaulteValue;
	static float floatDefaulteValue;
	static boolean booleanDefaulteValue;
	static double doubleDefaulteValue;
public static void main(String[] args) {
	System.out.println("****** Default values for INTEGER *******"+'\n');
	
	
	System.out.println("default value for byte = "+byteDefaulteValue+'\n'+"default value for short = "+shortDefaulteValue+'\n'+"default value for int = "+intDefaulteValue+'\n'+
			"default value for long = "+longDefaulteValue+"l");
	System.out.println('\n'+"******** Default values for CHARACTER  ********"+'\n');
	
	System.out.println("default value for character = "+characterDefaulteValue);
	System.out.println('\n'+"******* Default values for BOOLEAN ********"+'\n');
	
	System.out.println("Default value for boolean = "+booleanDefaulteValue);
	
	System.out.println('\n'+"******** Default values for DECIMAL  ********"+'\n');

	System.out.println("Default value for float = "+floatDefaulteValue+"f");
	
	System.out.println("Default value for double = "+doubleDefaulteValue+"d");

}
}
