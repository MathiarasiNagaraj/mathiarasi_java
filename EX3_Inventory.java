package Exercise_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EX3_Inventory {
	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(2);
		Inventory object = new Inventory();
		for(int i=0;i<10;i++)
		{
		es.execute(() -> {
			Thread.currentThread().setName("Producer");

			object.produce();

			Thread.currentThread().setName("Consumer");

			object.consume();

		});
		}
	}
}

class Inventory {
int itemCount=0;

	synchronized public void produce() {
		if (itemCount==1) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("Producing ");
		itemCount++;
		notify();
	}

	synchronized public void consume() {
		if (itemCount==0) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("Consuming");
		itemCount--;
		notify();
	}
}
