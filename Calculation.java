package Exercise_6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Calculation {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double speed, distance,workingHour;
		String date, time;
	
		LocalDateTime start=null;
		LorryDriver driver=new LorryDriver();
		
		Scanner scan = new Scanner(System.in);
		//getting details from the user
		System.out.println("Enter speed of driving in km/hr:");
		
		speed = scan.nextDouble();
		System.out.println("Enter distance to cover in km:");
		distance = scan.nextDouble();
		System.out.println("Enter the working hour in a day excluding break hours:");
		workingHour = scan.nextDouble();
		System.out.println("Enter the travelling date in DD/MM/YYYY format :");
		date = scan.next();
		
		System.out.println("Enter the travelling time in HH:MM format");
		time = scan.next();
		
		//setting driver with speed and working hours
		
		driver.setDrivingSpeed(speed);
		driver.setWorkingHours(workingHour);
		System.out.println(date+" "+time);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		try {
			start = LocalDateTime.parse(date+" "+time, format);
		} 
		catch (Exception e) {
			System.out.println("Enter date correct format !!!");
		}
		//passing distance,start as datetime object,driver object
		TravelTime timetaken=new TravelTime(distance,start,driver);
		timetaken.calculateTime();
		scan.close();

	}
}
