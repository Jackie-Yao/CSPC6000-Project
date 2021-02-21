package Project;

//
public class ActionItem {
	int Hour;
	int Minute;
	int index;
	String ActionName;
	Object someobject;
	
	public ActionItem(int hour, int minute) {
		this.Hour = hour;
		this.Minute = minute;
		this.index = hour * 10 + minute;
		this.ActionName = "";
	}
	
	
	public void TimeWarning() {
		//build some test case here
		System.out.println("Hour in the scale of 24, Minute options = [0,10,20,30,40,50]");
		
	}
}
