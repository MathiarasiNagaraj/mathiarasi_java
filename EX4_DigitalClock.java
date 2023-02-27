package Exercise_5;


import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EX4_DigitalClock {
public static void main(String[] args) {

	DigitalClock clock=new DigitalClock();
	ExecutorService es=Executors.newFixedThreadPool(2);

	{
	es.execute(()->{
		
		Thread.currentThread().setName("second");
		try {
			while(true)
			{
			Thread.sleep(1000);
			clock.displayTime();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
			
		});
	}
	
	

}

}
class DigitalClock{
	int hour,minute,second;
   DigitalClock()
   {
	   LocalTime localTime = LocalTime.now();
		 hour=localTime.getHour();
		 minute=localTime.getMinute();
		 second=localTime.getSecond();
   }
	
	void displayTime()
	{
          second=second+1;
          if(second==59)
          {
        	  minute=minute+1;
        	  second=0;
          }
          if(minute==59)
          {
        	  hour=hour+1;
        	  minute=0;
          }
          if((hour==23&&minute==59))
          {
        	  hour=0;
        	  minute=0;
        	  second=0;
          }
     
          
		System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
	
	}
}
