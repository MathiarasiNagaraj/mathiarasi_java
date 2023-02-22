package Exercise_4;
import java.io.*;
public class EX1_IOExceptionClass {
public static void main(String[] args) throws  Exception{
	
	try {
		FileReader filereaderObj=new FileReader("text.txt"); 
	}catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	}
}
}
