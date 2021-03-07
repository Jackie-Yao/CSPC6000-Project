package Project;

public class ActionItemList {
	ActionItem[] ActionItems = new ActionItem[10];
	

	//Laster would change to user input related
	public  ActionItemList(int WakeUpHour, int WakeUpMinute, int SleepDurationHour, int SleepDurationMinute) {
		// set up wake up time
		
		Time WakeUpTime = new Time(WakeUpHour,WakeUpMinute);
		this.ActionItems[3] = new ActionItem(WakeUpTime, "WAKE UP");
		
		// bedtime
		Time BedTime = WakeUpTime.GetSubtractedTime(SleepDurationHour, SleepDurationMinute);
		this.ActionItems[2] = new ActionItem(BedTime, "BED TIME");
		
		//Light Off
		Time LightOff = BedTime.GetSubtractedTime(0, 30);
		this.ActionItems[1] = new ActionItem(LightOff, "LIGHT DIM DOWN");
		
		//Curtain Close
		Time CurtainClose = LightOff.GetSubtractedTime(0, 10);
		this.ActionItems[0] = new ActionItem(CurtainClose, "CURTAIN CLOSE");
		
		// Morning: Light ON
		Time LightOn = WakeUpTime.GetAddedTime(0, 15);
		this.ActionItems[4] = new ActionItem(LightOn, "LIGHT DIM UP");
				
		//Curtain Open Morning
		Time CurtainOpen = LightOn.GetAddedTime(0,30);
		this.ActionItems[5] = new ActionItem(CurtainOpen, "CURTAIN OPEN");
	}
	
	public ActionItemIterator CreateIterator() {
		return new ActionItemIterator(this.ActionItems);
	}
}
