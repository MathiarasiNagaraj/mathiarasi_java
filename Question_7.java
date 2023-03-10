package Exercise_7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;

import java.io.IOException;

/*
 * copy file contents char by char**/
public class Question_7 {
	public static void main(String[] args) throws IOException {
		FileReader fin = null;
		FileWriter fout = null;
		int i;

		try {
			fin = new FileReader("/Users/mathiarasi/Desktop/Files/Inputfile.txt");
		} catch (FileNotFoundException fe) {
			System.out.println("Check whether file exist");
		}
		try {
			fout = new FileWriter("/Users/mathiarasi/Desktop/Files/Outputfile.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Error Opening Output File");
		}

		while ((i = fin.read()) != -1) {
			fout.write(i);

		}
		System.out.println("File copied successfully ");
		fin.close();
		fout.close();

	}
}
