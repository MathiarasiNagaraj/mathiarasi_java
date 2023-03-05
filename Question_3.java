package Exercise_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.*;

public class Question_3 {
	public static void main(String[] args) {
		System.out.println("1.Rename file\n2.write file\n3.display file size\n4.Read file\n5.delete file\n6.stop");
		Scanner scan = new Scanner(System.in);
		File file = new File("Javademo.txt");
		Path source = Paths.get(file.getName());
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int i = 0;
		while (i != 5) {

			System.out.println("Enter your option :\n");
			i = scan.nextInt();

			switch (i) {
			case 1: {
				System.out.println("Enter new file name ");
				String newName = scan.next();
				File newFile = new File(newName);
				try {
					file.renameTo(newFile);
					System.out.println("File successfully renamed into"+file.getName());
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
			}
			case 2: {
				System.out.println("Enter message to write in " + file.getName());
				String message = scan.next();

				try {

					Files.writeString(source, message);
					System.out.println("Successfully wrote to the file.");
					scan.next();
				} catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}

				break;
			}
			case 3: {
				System.out.println(file.length() + " bytes");
				break;
			}
			case 4: {
				try {

					Scanner myReader = new Scanner(file);
					while (myReader.hasNext()) {
						String data = myReader.next();
						System.out.println(data);
					}
					myReader.close();
				} catch (FileNotFoundException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
				break;
			}
			case 5: {
				if (file.delete()) {
					System.out.println("Deleted the file: " + file.getName());
				} else {
					System.out.println("Failed to delete the file.");
				}
				break;
			}
			case 6: {
				System.exit(0);

			}
			default:
				System.out.println("Enter valid option");
			}

		}
	}
}
