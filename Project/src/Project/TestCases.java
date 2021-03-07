package Project;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Light bedroomlight = new Light();
		LightControl lightcontrol = new LightControl(new LightCommandDimUp(bedroomlight), 
				new LightCommandDimDown(bedroomlight));
		
		bedroomlight.DimUp();
		bedroomlight.DimDown();
		
		
		ActionItemList actionitems = new ActionItemList(8,10, 4, 20);
		ActionItemIterator iter = actionitems.CreateIterator();
		
		while(iter.hasNext()) {
			ActionItem item =  (ActionItem)iter.next();
			item.PrettyPrintAction();
		}
		*/
		
		BedtimePreparationFacade BedtimePrepSystem = new BedtimePreparationFacade();
		BedtimePrepSystem.SetWakeUpTime(9, 15);
		
		BedtimePrepSystem.StartPreparation();
	}

}
