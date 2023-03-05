package Exercise_7;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

/*
 * program to copy Image byte byte
 * **/
public class Question_5 {
	public static void main(String[] args) throws IOException {
		/*
		 * Reading file through fileinputstream class
		 **/
		try (FileInputStream inputFile = new FileInputStream("/Users/mathiarasi/Desktop/Files/image.jpeg");
				FileOutputStream outputFile = new FileOutputStream("/Users/mathiarasi/Desktop/Files/imagecopy.jpeg");) {
			System.out.println(inputFile.available());
			int n = 0;
			byte b[] = new byte[1024];
			while ((n = inputFile.read(b)) != -1) {
				String s = new String(b, 0, n);
				outputFile.write(b, 0, n);
			}
			System.out.println("Image copied successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}

	}
}
