package Exercise_7;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/*
 * write date object to file
 * **/
public class Question_9 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		try {
			FileOutputStream fileOut = new FileOutputStream("/Users/mathiarasi/Desktop/Files/Inputfile.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(new Date());
			objectOut.close();

			System.out.println("The Object  was succesfully written to a file");
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("/Users/mathiarasi/Desktop/Files/Inputfile.txt"));

			// read and print an object and cast it as string
			System.out.println("" + ois.readObject());
		} catch (FileNotFoundException e) {
			System.out.println("Error Opening Output File");
		}
	}
}
