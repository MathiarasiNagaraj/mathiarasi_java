package Exercise_7;
import java.util.*;
public class Question_1 {
public static void main(String[] args) {
	System.out.println("Enter a message :");
	Scanner scan=new Scanner(System.in);
	String message=scan.nextLine();

    String messages[]=message.split(" ");
	System.out.println("Your message has "+messages.length+" words");
}
}
