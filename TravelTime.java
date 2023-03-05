package Exercise_6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TravelTime {
	float distance, time, timeInMinutes, remainingMinutesInADay, startingMinute, reachingMinute;
	LocalDateTime start;
	LocalDateTime reach;
	LorryDriver driver;


	/*
	 * constructor with distance,time,date and driver as a parameter
	 */
	public TravelTime(float distance, LocalDateTime start, LorryDriver driver) {
		this.distance = distance;
		this.start = start;
		this.driver = driver;
	}

	/*
	 * Calculate time is method that will calculate the time taking to complete the
	 * travel
	 **/
	public void calculateTime() {
		time = distance / driver.getDrivingSpeed();
		timeInMinutes = time * 60;
        float minutesdrived;
		while (!driver.checkLeaveDays(start)) {
			start = start.plusDays(1);
		}
		// Total minutes in a day -starting hour * 60 -starting minutes
		remainingMinutesInADay = (24 * 60) - (60 * start.getHour()) - start.getMinute();
		if(remainingMinutesInADay>driver.getWorkingHours()*60)
		{
			minutesdrived=driver.getWorkingHours()*60;
		}
		else
			minutesdrived=remainingMinutesInADay;
		
		if (timeInMinutes < minutesdrived) {
			reach = start.plusMinutes((long) timeInMinutes);
			

			System.out.println(
					"Lorry will reach at " + reach.format(DateTimeFormatter.ofPattern("E dd/mm/yyyy HH:mm")));
		}
		else {
			timeInMinutes-=minutesdrived;
		}
		//if drived minutes is not less than a day then we have to add one day from starting day
		float workingMinuteInADay= driver.getWorkingHours()*60;
		reach = LocalDateTime.of(start.getYear(), start.getMonth(), start.getDayOfMonth(),0, 0);
				
		reach = reach.plusDays(1);
		while (timeInMinutes >=workingMinuteInADay) {
			if (driver.checkLeaveDays(reach)) {
				timeInMinutes-=workingMinuteInADay;
			}
			reach = reach.plusDays(1);
		}

		// calculates the minutes in last day
		while (!driver.checkLeaveDays(reach)) {
			reach= reach.plusDays(1);
		}
		reach = reach.plusMinutes((long)timeInMinutes);
		System.out
				.println("Lorry will reach in " + reach.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
	
	
}
}
