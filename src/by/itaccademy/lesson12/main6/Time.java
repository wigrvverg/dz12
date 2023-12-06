package by.itaccademy.lesson12.main6;

public class Time {
	private int hour;
	private int minute;
	private int second;
	public Time (int _hour, int _minute, int _second) {
		setHour(_hour);
		setMinute(_minute);
		setSecond(_second);
		
		
		
	}
	public void setHour(int _hour) {
		if(_hour>24) {
			hour=0;
		}
		else {
			hour = _hour;	
		}
		
	}
	public void setMinute(int _minute) {
		if(_minute>60) {
			minute=0;
		}
		else {
			minute = _minute;	
		}

}
	public void setSecond(int _second) {
		if(_second>60) {
			second=0;
		}
		else {
			second = _second;	
		}

}
	 public void print() {
		  System.out.println(hour + ":" + minute + ":" + second);
		 } }

