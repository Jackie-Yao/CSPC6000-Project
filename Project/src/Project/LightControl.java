package Project;

public class LightControl {
	LightCommand DimUpcommand;
	LightCommand DimDowncommand;
	
	public LightControl(LightCommand DimUp, LightCommand DimDown) {
		this.DimUpcommand = DimUp;
		this.DimDowncommand = DimDown;
	}
	
	public void DimUp() {
		DimUpcommand.execute();
	}
	
	public void DimDown() {
		DimDowncommand.execute();
	}
	
}
