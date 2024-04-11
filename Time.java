package javaassignment3;

public class Time {
	private int hr, min, seconds;

	public Time() {
		super();
	}

	public Time(int hr, int min, int seconds) {
		this.hr = hr;
		this.min = min;
		this.seconds = seconds;
	}

	public int getHr() {

		return hr;
	}

	public void setHr(int hr) {
		if (hr <= 24)
			this.hr = hr;
		else
			System.out.println("plase enter hours between 24");
	}

	public int getMin() {

		return min;
	}

	public void setMin(int min) {
		if (min <= 60)
			this.min = min;
		else
			System.out.println("plase enter minits between 60");
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds <= 60)
			this.seconds = seconds;
		else
			System.out.println("plase enter seconds between 60");

	}

	@Override
	public String toString() {
		return "Time \nhr  =" + hr +
				",\nmin =" + min + 
				",\nseconds=" + seconds;
	}

	public static void main(String[] args) 
	{

		Time time =new Time(25, 20, 60);
		System.out.println(time);
		
		
	}

}
