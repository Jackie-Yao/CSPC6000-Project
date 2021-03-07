package Project;

//
public class ActionItem {
	Time time;
	String ActionName;

	
	// reserved for idle time slot
	public ActionItem(Time time) {
		this.time = time;
		this.ActionName = null;
	}
	
	// allow user input
	public ActionItem(Time time, String ActionName) {
		this.time = time;
		this.ActionName = ActionName;
	}
	
	
	public String GetAction() {
		return this.ActionName;
	}
	
	public void PrettyPrintAction() {
		System.out.println(this.time.GetTime() + " - " + this.ActionName);
	}
}
