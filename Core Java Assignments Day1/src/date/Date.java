package date;
public class Date {

	int day;
	int month;
	int year;
	
	public Date() {
		this.day=11;
		this.month=03;
		this.year=1998;
	}
	
	public Date(int d,int m,int y) {
		setDay(d);
		setMonth(m);
		setYear(y);
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) 
	{
		if(day>0 && day<=31) 
		{
			this.day = day;
		}
		else {
			System.out.println("Invalid Day");
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month>0 && month<=12) 
		{
			this.month = month;
		}
		else
		{
			System.out.println("Invalid Month");
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>0)
		{
			this.year = year;
		}
		else
		{
			System.out.println("Invalid Year");
		}
	}
	
	@Override
	public String toString() {
		
		return day+"/"+month+"/"+year;
	}
}
