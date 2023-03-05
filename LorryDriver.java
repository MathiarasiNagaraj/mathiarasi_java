package Exercise_6;

 import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LorryDriver {
	float drivingSpeed, workingHours;

	
	public float getDrivingSpeed() {
		return drivingSpeed;
	}

	public void setDrivingSpeed(float drivingSpeed) {
		this.drivingSpeed = drivingSpeed;
	}

	public float getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(float workingHours) {
		this.workingHours = workingHours;
	}

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
