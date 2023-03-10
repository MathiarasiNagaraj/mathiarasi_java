package Exercise_6;

 import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LorryDriver {
	private double drivingSpeed, workingHours;

	/**
	 * 
	 * @return the driving speed
	 */
	public double getDrivingSpeed() {
		return drivingSpeed;
	}
 /**
  * 
  * @param drivingSpeed speed of a driver
  */
	public void setDrivingSpeed(double drivingSpeed) {
		this.drivingSpeed = drivingSpeed;
	}
/**
 * 
 * @return working hour per day
 */
	public double getWorkingHours() {
		return workingHours;
	}
/**
 * 
 * @param workingHours
 */
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
/**
 * 
 * @param date
 * @return true if it is leave day else false
 */
	public boolean checkLeaveDays(LocalDateTime date) {
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		DayOfWeek week = date.getDayOfWeek();
		// new year ,independence day republic day leave
		if ((month == 1 && (day == 1 || day == 26)) || (month == 8 && day == 15)) {
			return true;
		}
		// Sunday leave
		if (week.getValue() == 7) {
			return true;
		}
		// second Saturday leave
		if (week.getValue() == 6 && date.getDayOfMonth() > 7 && date.getDayOfMonth() <= 14)
			return true;
		return false;

	}

}
