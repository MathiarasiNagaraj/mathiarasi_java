package Exercise_5;
import java.util.concurrent.*;
public class EX1_OddEven {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			Thread.currentThread().setName("Even Number");
	
			printEven();

			
		});
		es.execute(()->{
			Thread.currentThread().setName("ODD Number");
			
			printOdd();
			
			
		});
	}
   synchronized public static void printEven()
    {
		System.out.println("Printing even");
    	for(int i=2;i<=100;i=i+2)
			System.out.print(i+" ");
    }
   synchronized public static void printOdd()
   {
	   System.out.println("\nPrinting odd");
	   for(int i=1;i<=99;i=i+2)
			System.out.print(i+" ");
   }
}
