package Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommandPatternJunitTest {

	@Test
	public void test() {
		Light bedroomlight = new Light();
		LightControl lightcontrol = new LightControl(new LightCommandDimUp(bedroomlight), 
				new LightCommandDimDown(bedroomlight));
		
		bedroomlight.DimUp();
		Double.compare(bedroomlight.getLightness(), 1);
		
		bedroomlight.DimDown();

		Double.compare(bedroomlight.getLightness(), 0);
		
		//assertEquals(bedroomlight.getLightness(),0);
	}

}
