package Project;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light bedroomlight = new Light();
		LightControl lightcontrol = new LightControl(new LightCommandDimUp(bedroomlight), 
				new LightCommandDimDown(bedroomlight));
		
		bedroomlight.DimUp();
		bedroomlight.DimDown();
	}

}
