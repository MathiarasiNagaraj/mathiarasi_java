package Exercise_7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Question_8 {
	/*
	 * Coping file content line by line
	 **/
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader("/Users/mathiarasi/Desktop/Files/Inputfile.txt"));
			outputStream = new PrintWriter(new FileWriter("/Users/mathiarasi/Desktop/Files/Readfile.txt"));

			String line;
			while ((line = inputStream.readLine()) != null) {
				outputStream.println(line);
			}
			System.out.println("Successfully copied");

		} catch (Exception e) {
			System.out.println(e);
		}

		if (inputStream != null) {
			inputStream.close();
		}
		if (outputStream != null) {
			outputStream.close();
		}
	}

}
