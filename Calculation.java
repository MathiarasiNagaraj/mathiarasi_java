package Exercise_6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
		float speed, distance;
		String date, time;
	
		LocalDateTime start=null;
		LorryDriver driver=new LorryDriver();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter speed of driving:");
		speed = scan.nextFloat();
		System.out.println("Enter distance to cover:");
		distance = scan.nextFloat();
		System.out.println("Enter the travelling date in DD/MM/YYYY format :");
		date = scan.next();
		
		System.out.println("Enter the travelling time in HH:MM format");
		time = scan.next();
		
		driver.setDrivingSpeed(speed);
		driver.setWorkingHours(8);
		System.out.println(date+" "+time);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		try {
			start = LocalDateTime.parse(date+" "+time, format);
		} catch (Exception e) {
			System.out.println("Enter date correct format !!!");
		}
		TravelTime timetaken=new TravelTime(distance,start,driver);
		timetaken.calculateTime();
		scan.close();

	}
}
