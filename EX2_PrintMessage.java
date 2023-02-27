package Exercise_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EX2_PrintMessage {
public static void main(String[] args) {
ExecutorService es=Executors.newFixedThreadPool(3);
	
	es.execute(()->{
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		printMessage("1st thread");

		
	
	printMessage("2nd thread");

		

	printMessage("3rd thread");

		
	});
}
public  static void printMessage(String message)
{
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}	

	System.out.println("[------"+message+"------]");
}
}
