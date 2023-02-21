package Exercise_2;

class Employee{
	String Name;
    Date DateOfJoining;
    String ID;
    void Name(String n)
    {
    	this.Name=n;
    }
    String getName()
    {
    	return Name;
    }
    void setDateOfJoining(Date d)
    {
    	this.DateOfJoining=d;
    }
    Date getDateOfJoining()
    {
    	return DateOfJoining;
    }
    void setID(String s)
    {
    	this.ID=s;
    }
    String getID()
    {
    	return ID;
    }
}
class SalesPerson extends Employee{
	int salesTarget;
	void setsalesTarget(int s)
    {
    	this.salesTarget=s;
    }
    int getsalesTarget()
    {
    	return salesTarget;
    }
}
class Worker extends Employee{
	int bonus
}
class SalesManager extends SalesPerson{
	
}
class SalesTerritoryManager extends SalesManager{
	
}
class Date{
	int Date,Month,Year;
	Date(int Date,int Month,int Year)
	{
		this.Date=Date;
		this.Month=Month;
		this.Year=Year;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Date+"/"+this.Month+"/"+this.Year;
	}
}
public class EX3_Payroll {
public static void main(String[] args) {
	
}
}
