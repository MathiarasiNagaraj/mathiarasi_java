package Exercise_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EX7_Count {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);

		es.execute(()->{
			
			Thread.currentThread().setName("Even Number");
	        try {
	        	int i=1;
	        	while(i<=100)
	        	{
				Thread.sleep(1000);
			
				if(i%10==0)
					System.out.println("Text");
				else
					System.out.println(i);
				i++;
				
	        	}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        

			
		});
	}
}
