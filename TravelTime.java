package Exercise_6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TravelTime {
	double distance; 
	double time, totalMinutesToReach, remainingMinutesInAStartDay, startingMinute, reachingMinute;
	LocalDateTime start;
	LocalDateTime reach;
	LorryDriver driver;

	/*
	 * constructor with distance,time,date and driver as a parameter
	 */
	/**
	 * 
	 * @param distance distance to cover
	 * @param start starting time of the journey
	 * @param driver driver object with leave days and speed details
	 */
	public TravelTime(double distance, LocalDateTime start, LorryDriver driver) {
		this.distance = distance;
		this.start = start;
		this.driver = driver;
	}
/**
 * 
 * method will calculate the minutes to cover and add that to start day
 * leave days are checked 
 */
	public void calculateTime() {
		time =  (distance / driver.getDrivingSpeed());
		time= Math.ceil(time);
		totalMinutesToReach = time * 60;
		double minutesdrivedInStartDay;
		/*
		 * if starting date is a leave day then add 1 day until it is a working day **/
		//check leave will return true if it is leave day else false
		while (driver.checkLeaveDays(start)) {
			start = start.plusDays(1);
		}
		// Total minutes in a day -starting hour * 60 -starting minutes
		remainingMinutesInAStartDay = (24 * 60) - (60 * start.getHour()) - start.getMinute();
		double workingMinuteInADay = driver.getWorkingHours() * 60;
		//if remaining minutes in a day is less than driver working minutes then minutes drived is remainingMinutesInADay
		//else total driving is drived minutes
		minutesdrivedInStartDay=(remainingMinutesInAStartDay > workingMinuteInADay)?workingMinuteInADay:remainingMinutesInAStartDay;
	
        //if time take to complete distance is less than or equal to minutes drived in a same day
		//add minutes to start date
		if(minutesdrivedInStartDay>=totalMinutesToReach)
		{
			reach = start.plusMinutes((long) totalMinutesToReach);
			System.out.println("Lorry will reach at " + reach.format(DateTimeFormatter.ofPattern("E dd/MM/yyyy HH:mm")));
			return;
		}
		// if drived minutes is not less than a day then we have to add one day from
		// starting day
		reach = LocalDateTime.of(start.getYear(), start.getMonth(), start.getDayOfMonth(), 0, 0);
		reach = reach.plusDays(1);

		//total time taken to cover the distance is check with working minute in day for each
		//minus the minutes drived  with total minutes  for each day
		//add one day until minutes need to drive is less than a minutesdrived in a day
		while(totalMinutesToReach>=workingMinuteInADay)
		{
			if(!driver.checkLeaveDays(reach))
			{
				totalMinutesToReach-=workingMinuteInADay;
			}
			reach=reach.plusDays(1);
			
		}
	
		// calculates the minutes in last day
		while (!driver.checkLeaveDays(reach)) {
			reach = reach.plusDays(1);
		}
		reach = reach.plusMinutes((long) totalMinutesToReach);

		System.out.println("Lorry will reach at " + reach.format(DateTimeFormatter.ofPattern("E dd/MM/yyyy HH:mm")));

	}
}
