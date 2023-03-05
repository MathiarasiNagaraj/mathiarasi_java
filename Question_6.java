package Exercise_7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question_6 {
	/*
	 * Reading file content using FileReader class**/
public static void main(String[] args) throws IOException {
	FileReader fin;
	int i;
	Scanner scan=new Scanner(System.in);
	

	
	fin=new FileReader("/Users/mathiarasi/Desktop/Files/Inputfile.txt");    
    
    while((i=fin.read())!=-1)    
    System.out.print((char)i);    
    fin.close(); 
    scan.close();
}
}
