package Project;

public class Time {
	int Hour;
	int Minute;
	
	public Time(int Hour, int Minute) {
		this.Hour = Hour;
		this.Minute = Minute;
		this.CheckTime();
	}
	
	public void CheckTime() {
		if(this.Hour < 0 || this.Hour >= 24 || this.Minute < 0 ||  this.Minute >= 60) {
			System.out.println("Wrong Time input");
		}
	}
	
	public int GetHour() {
		return this.Hour;
	}
	
	public int GetMinute() {
		return this.Minute;
	}
	
	public Time GetAddedTime(int AddHour, int AddMinute) {
		int AddedHour;
		int AddedMinute;
		
		if((this.Minute + AddMinute) < 60) {
			AddedMinute = this.Minute + AddMinute;
		}else {
			AddedMinute = (this.Minute + AddMinute)- 60;
			AddHour += 1;
		}
		
		if((this.Hour + AddHour) < 24) {
			AddedHour = this.Hour + AddHour;
		}else {
			AddedHour = this.Hour + AddHour - 24;
		}		
		return(new Time(AddedHour, AddedMinute));
	}
	
	
	public Time GetSubtractedTime(int SubtractHour, int SubtractMinute) {
		int SubtractedHour;
		int SubtractedMinute;
		
		if((this.Minute - SubtractMinute) >= 0) {
			SubtractedMinute = this.Minute - SubtractMinute;

		}else {
			SubtractedMinute = (this.Minute - SubtractMinute) + 60;
			SubtractHour += 1;
		}
		
		if((this.Hour - SubtractHour) >= 0) {
			SubtractedHour = this.Hour - SubtractHour;
		}else {
			SubtractedHour = this.Hour - SubtractHour + 24;
		}		
		return(new Time(SubtractedHour, SubtractedMinute));
	}
	
	public String GetTime() {
		return(String.format("%02d",this.Hour) + ":" + String.format("%02d",this.Minute));
	}
	
	// has to call 

	
}
