package Project;

public class BedtimePreparationFacade {
	Light bedroomlight;
	LightControl lightcontrol;
	CurtainContext curtain;
	int SleepDurationHour = 7;
	int SleepDurationMinute = 0;
	ActionItemList actionitems;
	ActionItemIterator iter;
	Alarm alarm;
	String indent = "	";
	
	
	public BedtimePreparationFacade() {
		this.bedroomlight = new Light();
		this.lightcontrol = new LightControl(new LightCommandDimUp(bedroomlight), 
				new LightCommandDimDown(bedroomlight));
		this.curtain = new CurtainContext();
		this.alarm = new Alarm();
	}
	
	public void ChangeDefaultSleepHour(int NewSleepHour, int NewSleepMinute) {
		this.SleepDurationHour = NewSleepHour;
		this.SleepDurationMinute = NewSleepMinute;
		if(this.SleepDurationHour < 7) {
			System.out.println("Warning: Sleep Hour less than 7 Hour!");
		}
	}
	
	public void SetWakeUpTime(int WakeUpHour, int WakeUpMinute) {
		this.actionitems = new ActionItemList(WakeUpHour,WakeUpMinute, this.SleepDurationHour, this.SleepDurationMinute);
		this.iter = this.actionitems.CreateIterator();
	}
	
	public void Execute(String ActionName) {
		if(ActionName == "CURTAIN OPEN") {
			this.curtain.OpenCurtain();		
			this.curtain.PrintStatus();
			
		} else if(ActionName == "CURTAIN CLOSE") {
			this.curtain.CloseCurtain();		
			this.curtain.PrintStatus();
			
		} else if (ActionName == "LIGHT DIM UP") {
			this.bedroomlight.DimUp();
			
		} else if (ActionName == "LIGHT DIM DOWN") {
			this.bedroomlight.DimDown();
		
		} else if (ActionName == "BED TIME") {
			this.alarm.BedtimeAlarm();
		
		} else if (ActionName == "WAKE UP") {
			this.alarm.MorningAlarm();
			
		} else {
			System.out.println(this.indent + ActionName);
		}
	}
	
	public void StartPreparation() {
		while(iter.hasNext()) {
			ActionItem item =  (ActionItem)iter.next();
			item.PrettyPrintAction();
			Execute(item.GetAction());
		}
	}
	
}

