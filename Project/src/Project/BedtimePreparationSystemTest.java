package Project;

public class BedtimePreparationSystemTest {

	public static void main(String[] args) {


		BedtimePreparationFacade BedtimePrepSystem = new BedtimePreparationFacade();
		
		// Case 1: Set wake up time at 8:10, default sleeping time as 7 hour.
		System.out.println("###############################################################");
		System.out.println("CASE 1: wakes up at 8:10, used default sleeping time as 7 hour");
		
		BedtimePrepSystem.SetWakeUpTime(8, 10);	
		BedtimePrepSystem.StartPreparation();
		
		
		// Case 2: Set wake up time at 9:15, set sleeping time as 5 and a half hour.
		System.out.println("###############################################################");
		System.out.println("CASE 2: wakes up at 6:15, intended sleep time: 5 hour and a half");
		
		BedtimePrepSystem.ChangeDefaultSleepHour(5, 30);		
		BedtimePrepSystem.SetWakeUpTime(6, 15);
		BedtimePrepSystem.StartPreparation();
		
		// Case 3: Set wake up time at 7:00, sleep 8 hour, extend dim off/on time to 20 minutes.
		System.out.println("###############################################################");
		System.out.println("CASE 3: wakes up at 7:00, intended sleep time: 8 hour, light dim off time extends to 20 min");
		
		BedtimePrepSystem.bedroomlight.resetDimTime(20);
		BedtimePrepSystem.ChangeDefaultSleepHour(8, 0);		
		BedtimePrepSystem.SetWakeUpTime(7,0);
		BedtimePrepSystem.StartPreparation();
		
	}

}
