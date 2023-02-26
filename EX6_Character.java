package Exercise_5;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NonAlphCharacter extends Exception{
	String message="Enter a alphaphetic character";
	public NonAlphCharacter() {
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
}
class CharacterThread{
	void print(char character) throws NonAlphCharacter
	{
		try {
			if(character>='a'&&character<='z'||character>='A'&&character<='Z')
		System.out.println(character);
			else
		throw new NonAlphCharacter();
		
		}catch(NonAlphCharacter ne)
		{
			System.out.println(ne);
		}
	}
}
public class EX6_Character {
public static void main(String[] args) throws NonAlphCharacter {
	String word;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a word :");
	word=sc.nextLine();
	CharacterThread thread=new CharacterThread();
	ExecutorService es=Executors.newFixedThreadPool(2);
	
	es.execute(()->{
		Thread.currentThread().setName("printer");
		int i=0;
      while(i<word.length())
      {
		try {
			thread.print(word.charAt(i));
			i++;
		} catch (NonAlphCharacter e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
      }
		
	});
	}
}
