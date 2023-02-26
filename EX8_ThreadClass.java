package Exercise_5;
 class ThreadClass extends Thread{
	 static int i=0;
	 StringBuffer buffer;
	 public ThreadClass(StringBuffer bufferArgument) {
			// TODO Auto-generated constructor stub
		 buffer=bufferArgument;
		}
	 @Override
	 
	public void run() {
		synchronized (buffer) {
			Thread.currentThread().setName("thread_No_"+(i++));
			System.out.println(Thread.currentThread().getName());
			for(int i=0;i<3;i++)
			{
				System.out.println(buffer);
			}
			buffer.setCharAt(0, (char)(buffer.charAt(0) + 1));
			
		}
	}
 }
public class EX8_ThreadClass {
public static void main(String[] args) {
	StringBuffer string=new StringBuffer("A");
	ThreadClass thread1=new ThreadClass(string);
	ThreadClass thread2=new ThreadClass(string);
	ThreadClass thread3=new ThreadClass(string);
	thread1.start();
	thread2.start();
	thread3.start();
}
}
