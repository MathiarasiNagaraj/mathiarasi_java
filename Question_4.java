package Exercise_7;

import java.io.File;

/*
 * Program to list all files and directories
 * **/
public class Question_4 {
public static void main(String[] args) {
	/*
	 * Creating file objects for directory
	 * **/
	File fileDir=new File("/Users/mathiarasi/Desktop");
	/*
	 * Function to List of all directory
	 * **/
	listFiles(fileDir);

}
static void listFiles(File fileDir)
{
	File  fileList[]=fileDir.listFiles();
	for(File files:fileList)
	{
		System.out.println("File name :"+files.getName());
		System.out.println("File path :"+files.getAbsolutePath()+"\n");
		
	}

}
}
